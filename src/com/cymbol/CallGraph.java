package com.cymbol;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.OrderedHashSet;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.cymbol.CymbolParser.CallContext;
import com.cymbol.CymbolParser.FunctionDeclContext;

public class CallGraph {
	
	public static class Graph {
		Set<String> nodes = new OrderedHashSet<String>();
		MultiMap<String, String> edges = new MultiMap<String, String>();
		
		public void edge(String source, String target) {
			edges.map(source, target);
		}
		
		public String toDOT() {
			StringBuilder builder = new StringBuilder();
			
			/** config */
			builder.append("digraph G { \n");
			builder.append("  ranksep=.25;\n");
			builder.append("  edge [arrowsize=.5]\n");
			builder.append("  node[sharpe=circle, fontname=\"ArialNarrow\", \n");
			builder.append("  		fonsize=12, fixedsize=true, height=.45];\n");
			builder.append("   ");
			
			/** node */
			for(String node : nodes) {
				builder.append(node);
				builder.append("; ");
			}
			builder.append("\n");
			
			/** edge */
			for(String src : edges.keySet()) {
				for (String trg : edges.get(src)) {
					builder.append(" ");
					builder.append(src);
					builder.append(" -> ");
					builder.append(trg);
					builder.append(";\n");
				}
			}
			builder.append("}\n");
			
			return builder.toString();
		}

	}
	
	public static class FunctionListener extends CymbolBaseListener {
		Graph graph = new Graph();
		String currentFunctionName = null;
		
		/**
		 * expr    :   ID '(' exprList? ')'    #Call
		 */
		@Override
		public void exitCall(CallContext ctx) {
			String funcName = ctx.ID().getText();
			/** map current function to the calle */
			graph.edge(currentFunctionName, funcName);
		}
		
		/**
		 * functionDecl
    			:       type ID '('formalParameters')' block
    			;
		 */
		@Override
		public void enterFunctionDecl(FunctionDeclContext ctx) {
			currentFunctionName = ctx.ID().getText();
			graph.nodes.add(currentFunctionName);
		}
	}
	
	/**
	 * Data:
int main() { fact(); a(); }
float fact(int n) {
print(n);
if ( n==0 ) then return 1;
return n * fact(n-1);
}
void a() { int x = b(); if false then { c(); d();} }
void b() { c(); }
void c() { b(); }
void d() { d(); }
void e() { e(); }
	 */
	public static void main(String[] args) throws Exception {
     
		System.out.println("Testing");
		
		String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        
        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();
        // show tree in text form
        // System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
        System.out.println(collector.graph.toString());
        System.out.println(collector.graph.toDOT());

    }
	
	
}
