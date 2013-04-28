// Generated from /home/hqthao/workspace/ANTLR Project/src/com/cymbol/Cymbol.g4 by ANTLR 4.0

        package com.cymbol;
        
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CymbolListener extends ParseTreeListener {
	void enterMult(CymbolParser.MultContext ctx);
	void exitMult(CymbolParser.MultContext ctx);

	void enterParens(CymbolParser.ParensContext ctx);
	void exitParens(CymbolParser.ParensContext ctx);

	void enterFormalParameter(CymbolParser.FormalParameterContext ctx);
	void exitFormalParameter(CymbolParser.FormalParameterContext ctx);

	void enterCall(CymbolParser.CallContext ctx);
	void exitCall(CymbolParser.CallContext ctx);

	void enterAddSub(CymbolParser.AddSubContext ctx);
	void exitAddSub(CymbolParser.AddSubContext ctx);

	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	void exitVarDecl(CymbolParser.VarDeclContext ctx);

	void enterBlock(CymbolParser.BlockContext ctx);
	void exitBlock(CymbolParser.BlockContext ctx);

	void enterType(CymbolParser.TypeContext ctx);
	void exitType(CymbolParser.TypeContext ctx);

	void enterStat(CymbolParser.StatContext ctx);
	void exitStat(CymbolParser.StatContext ctx);

	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);

	void enterNot(CymbolParser.NotContext ctx);
	void exitNot(CymbolParser.NotContext ctx);

	void enterIndex(CymbolParser.IndexContext ctx);
	void exitIndex(CymbolParser.IndexContext ctx);

	void enterFormalParameters(CymbolParser.FormalParametersContext ctx);
	void exitFormalParameters(CymbolParser.FormalParametersContext ctx);

	void enterFile(CymbolParser.FileContext ctx);
	void exitFile(CymbolParser.FileContext ctx);

	void enterEqual(CymbolParser.EqualContext ctx);
	void exitEqual(CymbolParser.EqualContext ctx);

	void enterNegate(CymbolParser.NegateContext ctx);
	void exitNegate(CymbolParser.NegateContext ctx);

	void enterInt(CymbolParser.IntContext ctx);
	void exitInt(CymbolParser.IntContext ctx);

	void enterVar(CymbolParser.VarContext ctx);
	void exitVar(CymbolParser.VarContext ctx);

	void enterExprList(CymbolParser.ExprListContext ctx);
	void exitExprList(CymbolParser.ExprListContext ctx);
}