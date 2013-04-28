// Generated from /home/hqthao/workspace/ANTLR Project/src/com/cymbol/Cymbol.g4 by ANTLR 4.0

        package com.cymbol;
        
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CymbolVisitor<T> extends ParseTreeVisitor<T> {
	T visitMult(CymbolParser.MultContext ctx);

	T visitParens(CymbolParser.ParensContext ctx);

	T visitFormalParameter(CymbolParser.FormalParameterContext ctx);

	T visitCall(CymbolParser.CallContext ctx);

	T visitAddSub(CymbolParser.AddSubContext ctx);

	T visitVarDecl(CymbolParser.VarDeclContext ctx);

	T visitBlock(CymbolParser.BlockContext ctx);

	T visitType(CymbolParser.TypeContext ctx);

	T visitStat(CymbolParser.StatContext ctx);

	T visitFunctionDecl(CymbolParser.FunctionDeclContext ctx);

	T visitNot(CymbolParser.NotContext ctx);

	T visitIndex(CymbolParser.IndexContext ctx);

	T visitFormalParameters(CymbolParser.FormalParametersContext ctx);

	T visitFile(CymbolParser.FileContext ctx);

	T visitEqual(CymbolParser.EqualContext ctx);

	T visitNegate(CymbolParser.NegateContext ctx);

	T visitInt(CymbolParser.IntContext ctx);

	T visitVar(CymbolParser.VarContext ctx);

	T visitExprList(CymbolParser.ExprListContext ctx);
}