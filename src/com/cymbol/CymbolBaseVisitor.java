// Generated from /home/hqthao/workspace/ANTLR Project/src/com/cymbol/Cymbol.g4 by ANTLR 4.0

        package com.cymbol;
        
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class CymbolBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CymbolVisitor<T> {
	@Override public T visitMult(CymbolParser.MultContext ctx) { return visitChildren(ctx); }

	@Override public T visitParens(CymbolParser.ParensContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameter(CymbolParser.FormalParameterContext ctx) { return visitChildren(ctx); }

	@Override public T visitCall(CymbolParser.CallContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSub(CymbolParser.AddSubContext ctx) { return visitChildren(ctx); }

	@Override public T visitVarDecl(CymbolParser.VarDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlock(CymbolParser.BlockContext ctx) { return visitChildren(ctx); }

	@Override public T visitType(CymbolParser.TypeContext ctx) { return visitChildren(ctx); }

	@Override public T visitStat(CymbolParser.StatContext ctx) { return visitChildren(ctx); }

	@Override public T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitNot(CymbolParser.NotContext ctx) { return visitChildren(ctx); }

	@Override public T visitIndex(CymbolParser.IndexContext ctx) { return visitChildren(ctx); }

	@Override public T visitFormalParameters(CymbolParser.FormalParametersContext ctx) { return visitChildren(ctx); }

	@Override public T visitFile(CymbolParser.FileContext ctx) { return visitChildren(ctx); }

	@Override public T visitEqual(CymbolParser.EqualContext ctx) { return visitChildren(ctx); }

	@Override public T visitNegate(CymbolParser.NegateContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(CymbolParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitVar(CymbolParser.VarContext ctx) { return visitChildren(ctx); }

	@Override public T visitExprList(CymbolParser.ExprListContext ctx) { return visitChildren(ctx); }
}