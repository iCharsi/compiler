package pascal;// Generated from D:/home/compilers/src/main/resources\pascal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CHR=7, CONST=8, DIV=9, 
		DO=10, DOWNTO=11, ELSE=12, END=13, FILE=14, FOR=15, FUNCTION=16, GOTO=17, 
		IF=18, IN=19, INTEGER=20, LABEL=21, MOD=22, NIL=23, NOT=24, OF=25, OR=26, 
		PACKED=27, PROCEDURE=28, PROGRAM=29, REAL=30, RECORD=31, REPEAT=32, SET=33, 
		THEN=34, TO=35, TYPE=36, UNTIL=37, VAR=38, WHILE=39, WITH=40, PLUS=41, 
		MINUS=42, STAR=43, SLASH=44, ASSIGN=45, COMMA=46, SEMI=47, COLON=48, EQUAL=49, 
		NOT_EQUAL=50, LT=51, LE=52, GE=53, GT=54, LPAREN=55, RPAREN=56, LBRACK=57, 
		LBRACK2=58, RBRACK=59, RBRACK2=60, POINTER=61, AT=62, DOT=63, DOTDOT=64, 
		LCURLY=65, RCURLY=66, UNIT=67, INTERFACE=68, USES=69, STRING=70, IMPLEMENTATION=71, 
		WS=72, COMMENT_1=73, COMMENT_2=74, IDENT=75, STRING_LITERAL=76, NUM_INT=77;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_usesUnitsPart = 4, RULE_labelDeclarationPart = 5, RULE_label = 6, 
		RULE_constantDefinitionPart = 7, RULE_constantDefinition = 8, RULE_constantChr = 9, 
		RULE_constant = 10, RULE_unsignedNumber = 11, RULE_unsignedInteger = 12, 
		RULE_unsignedReal = 13, RULE_sign = 14, RULE_string = 15, RULE_typeDefinitionPart = 16, 
		RULE_typeDefinition = 17, RULE_functionType = 18, RULE_procedureType = 19, 
		RULE_type = 20, RULE_simpleType = 21, RULE_scalarType = 22, RULE_subrangeType = 23, 
		RULE_typeIdentifier = 24, RULE_structuredType = 25, RULE_unpackedStructuredType = 26, 
		RULE_stringtype = 27, RULE_arrayType = 28, RULE_typeList = 29, RULE_indexType = 30, 
		RULE_componentType = 31, RULE_recordType = 32, RULE_fieldList = 33, RULE_fixedPart = 34, 
		RULE_recordSection = 35, RULE_variantPart = 36, RULE_tag = 37, RULE_variant = 38, 
		RULE_setType = 39, RULE_baseType = 40, RULE_fileType = 41, RULE_pointerType = 42, 
		RULE_variableDeclarationPart = 43, RULE_variableDeclaration = 44, RULE_procedureAndFunctionDeclarationPart = 45, 
		RULE_procedureOrFunctionDeclaration = 46, RULE_procedureDeclaration = 47, 
		RULE_formalParameterList = 48, RULE_formalParameterSection = 49, RULE_parameterGroup = 50, 
		RULE_identifierList = 51, RULE_constList = 52, RULE_functionDeclaration = 53, 
		RULE_resultType = 54, RULE_statement = 55, RULE_unlabelledStatement = 56, 
		RULE_simpleStatement = 57, RULE_assignmentStatement = 58, RULE_variable = 59, 
		RULE_expression = 60, RULE_simpleExpression = 61, RULE_term = 62, RULE_signedFactor = 63, 
		RULE_factor = 64, RULE_unsignedConstant = 65, RULE_functionDesignator = 66, 
		RULE_parameterList = 67, RULE_set = 68, RULE_elementList = 69, RULE_element = 70, 
		RULE_procedureStatement = 71, RULE_actualParameter = 72, RULE_gotoStatement = 73, 
		RULE_emptyStatement = 74, RULE_empty = 75, RULE_structuredStatement = 76, 
		RULE_compoundStatement = 77, RULE_statements = 78, RULE_conditionalStatement = 79, 
		RULE_ifStatement = 80, RULE_caseStatement = 81, RULE_caseListElement = 82, 
		RULE_repetetiveStatement = 83, RULE_whileStatement = 84, RULE_repeatStatement = 85, 
		RULE_forStatement = 86, RULE_forList = 87, RULE_initialValue = 88, RULE_finalValue = 89, 
		RULE_withStatement = 90, RULE_recordVariableList = 91;
	public static final String[] ruleNames = {
		"program", "programHeading", "identifier", "block", "usesUnitsPart", "labelDeclarationPart", 
		"label", "constantDefinitionPart", "constantDefinition", "constantChr", 
		"constant", "unsignedNumber", "unsignedInteger", "unsignedReal", "sign", 
		"string", "typeDefinitionPart", "typeDefinition", "functionType", "procedureType", 
		"type", "simpleType", "scalarType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "arrayType", 
		"typeList", "indexType", "componentType", "recordType", "fieldList", "fixedPart", 
		"recordSection", "variantPart", "tag", "variant", "setType", "baseType", 
		"fileType", "pointerType", "variableDeclarationPart", "variableDeclaration", 
		"procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
		"procedureDeclaration", "formalParameterList", "formalParameterSection", 
		"parameterGroup", "identifierList", "constList", "functionDeclaration", 
		"resultType", "statement", "unlabelledStatement", "simpleStatement", "assignmentStatement", 
		"variable", "expression", "simpleExpression", "term", "signedFactor", 
		"factor", "unsignedConstant", "functionDesignator", "parameterList", "set", 
		"elementList", "element", "procedureStatement", "actualParameter", "gotoStatement", 
		"emptyStatement", "empty", "structuredStatement", "compoundStatement", 
		"statements", "conditionalStatement", "ifStatement", "caseStatement", 
		"caseListElement", "repetetiveStatement", "whileStatement", "repeatStatement", 
		"forStatement", "forList", "initialValue", "finalValue", "withStatement", 
		"recordVariableList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "':='", "','", 
		"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
		"'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", 
		"DIV", "DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", 
		"IF", "IN", "INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", 
		"PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", 
		"TYPE", "UNTIL", "VAR", "WHILE", "WITH", "PLUS", "MINUS", "STAR", "SLASH", 
		"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", 
		"POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", 
		"USES", "STRING", "IMPLEMENTATION", "WS", "COMMENT_1", "COMMENT_2", "IDENT", 
		"STRING_LITERAL", "NUM_INT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public TerminalNode INTERFACE() { return getToken(PascalParser.INTERFACE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			programHeading();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERFACE) {
				{
				setState(185);
				match(INTERFACE);
				}
			}

			setState(188);
			block();
			setState(189);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public TerminalNode UNIT() { return getToken(PascalParser.UNIT, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProgramHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProgramHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(PROGRAM);
				setState(192);
				identifier();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(193);
					match(LPAREN);
					setState(194);
					identifierList();
					setState(195);
					match(RPAREN);
					}
				}

				setState(199);
				match(SEMI);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(UNIT);
				setState(202);
				identifier();
				setState(203);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<LabelDeclarationPartContext> labelDeclarationPart() {
			return getRuleContexts(LabelDeclarationPartContext.class);
		}
		public LabelDeclarationPartContext labelDeclarationPart(int i) {
			return getRuleContext(LabelDeclarationPartContext.class,i);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public List<UsesUnitsPartContext> usesUnitsPart() {
			return getRuleContexts(UsesUnitsPartContext.class);
		}
		public UsesUnitsPartContext usesUnitsPart(int i) {
			return getRuleContext(UsesUnitsPartContext.class,i);
		}
		public List<TerminalNode> IMPLEMENTATION() { return getTokens(PascalParser.IMPLEMENTATION); }
		public TerminalNode IMPLEMENTATION(int i) {
			return getToken(PascalParser.IMPLEMENTATION, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (CONST - 8)) | (1L << (FUNCTION - 8)) | (1L << (LABEL - 8)) | (1L << (PROCEDURE - 8)) | (1L << (TYPE - 8)) | (1L << (VAR - 8)) | (1L << (USES - 8)) | (1L << (IMPLEMENTATION - 8)))) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(209);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(210);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(211);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(212);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(213);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(214);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(215);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsesUnitsPartContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(PascalParser.USES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public UsesUnitsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesUnitsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUsesUnitsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUsesUnitsPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUsesUnitsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsesUnitsPartContext usesUnitsPart() throws RecognitionException {
		UsesUnitsPartContext _localctx = new UsesUnitsPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_usesUnitsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(USES);
			setState(224);
			identifierList();
			setState(225);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDeclarationPartContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(PascalParser.LABEL, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterLabelDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitLabelDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitLabelDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LABEL);
			setState(228);
			label();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				label();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			unsignedInteger();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitConstantDefinitionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitConstantDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CONST);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				constantDefinition();
				setState(242);
				match(SEMI);
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitConstantDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			identifier();
			setState(249);
			match(EQUAL);
			setState(250);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(PascalParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitConstantChr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitConstantChr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(CHR);
			setState(253);
			match(LPAREN);
			setState(254);
			unsignedInteger();
			setState(255);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				sign();
				setState(259);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				sign();
				setState(263);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				constantChr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsignedNumber);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				unsignedInteger();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				unsignedReal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(PascalParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(PascalParser.NUM_INT, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUnsignedReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PascalParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitTypeDefinitionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitTypeDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(TYPE);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				typeDefinition();
				setState(283);
				match(SEMI);
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			identifier();
			setState(290);
			match(EQUAL);
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case CHR:
			case FILE:
			case INTEGER:
			case PACKED:
			case REAL:
			case RECORD:
			case SET:
			case PLUS:
			case MINUS:
			case LPAREN:
			case POINTER:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
				{
				setState(291);
				type();
				}
				break;
			case FUNCTION:
				{
				setState(292);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(293);
				procedureType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(FUNCTION);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(297);
				formalParameterList();
				}
			}

			setState(300);
			match(COLON);
			setState(301);
			resultType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureTypeContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProcedureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProcedureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProcedureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureTypeContext procedureType() throws RecognitionException {
		ProcedureTypeContext _localctx = new ProcedureTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(PROCEDURE);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(304);
				formalParameterList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case CHR:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				simpleType();
				}
				break;
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				structuredType();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				pointerType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleType);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				stringtype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(LPAREN);
			setState(319);
			identifierList();
			setState(320);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSubrangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			constant();
			setState(323);
			match(DOTDOT);
			setState(324);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(PascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeIdentifier);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				identifier();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INTEGER) | (1L << REAL))) != 0) || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredTypeContext extends ParserRuleContext {
		public TerminalNode PACKED() { return getToken(PascalParser.PACKED, 0); }
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structuredType);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(PACKED);
				setState(331);
				unpackedStructuredType();
				}
				break;
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				unpackedStructuredType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUnpackedStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUnpackedStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUnpackedStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unpackedStructuredType);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				fileType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterStringtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitStringtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitStringtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(STRING);
			setState(342);
			match(LBRACK);
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(343);
				identifier();
				}
				break;
			case NUM_INT:
				{
				setState(344);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(347);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public TerminalNode LBRACK2() { return getToken(PascalParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(PascalParser.RBRACK2, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayType);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(ARRAY);
				setState(350);
				match(LBRACK);
				setState(351);
				typeList();
				setState(352);
				match(RBRACK);
				setState(353);
				match(OF);
				setState(354);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(ARRAY);
				setState(357);
				match(LBRACK2);
				setState(358);
				typeList();
				setState(359);
				match(RBRACK2);
				setState(360);
				match(OF);
				setState(361);
				componentType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			indexType();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366);
				match(COMMA);
				setState(367);
				indexType();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitIndexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitIndexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			simpleType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitComponentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitComponentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(PascalParser.RECORD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitRecordType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(RECORD);
			setState(378);
			fieldList();
			setState(379);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fieldList);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				fixedPart();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(382);
					match(SEMI);
					setState(383);
					variantPart();
					}
				}

				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				variantPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFixedPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFixedPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			recordSection();
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					match(SEMI);
					setState(391);
					recordSection();
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitRecordSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitRecordSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			identifierList();
			setState(398);
			match(COLON);
			setState(399);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterVariantPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitVariantPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitVariantPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variantPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(CASE);
			setState(402);
			tag();
			setState(403);
			match(OF);
			setState(404);
			variant();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(405);
				match(SEMI);
				setState(406);
				variant();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tag);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				identifier();
				setState(413);
				match(COLON);
				setState(414);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				typeIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			constList();
			setState(420);
			match(COLON);
			setState(421);
			match(LPAREN);
			setState(422);
			fieldList();
			setState(423);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PascalParser.SET, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(SET);
			setState(426);
			match(OF);
			setState(427);
			baseType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			simpleType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileTypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(PascalParser.FILE, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFileType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFileType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_fileType);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(FILE);
				setState(432);
				match(OF);
				setState(433);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(FILE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(PascalParser.POINTER, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(POINTER);
			setState(438);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitVariableDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(VAR);
			setState(441);
			variableDeclaration();
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(SEMI);
					setState(443);
					variableDeclaration();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(449);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			identifierList();
			setState(452);
			match(COLON);
			setState(453);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProcedureAndFunctionDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			procedureOrFunctionDeclaration();
			setState(456);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProcedureOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProcedureOrFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProcedureOrFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_procedureOrFunctionDeclaration);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(PROCEDURE);
			setState(463);
			identifier();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(464);
				formalParameterList();
				}
			}

			setState(467);
			match(SEMI);
			setState(468);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LPAREN);
			setState(471);
			formalParameterSection();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(472);
				match(SEMI);
				setState(473);
				formalParameterSection();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFormalParameterSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formalParameterSection);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(VAR);
				setState(483);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				match(FUNCTION);
				setState(485);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				match(PROCEDURE);
				setState(487);
				parameterGroup();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			identifierList();
			setState(491);
			match(COLON);
			setState(492);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			identifier();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(495);
				match(COMMA);
				setState(496);
				identifier();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			constant();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(503);
				match(COMMA);
				setState(504);
				constant();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(FUNCTION);
			setState(511);
			identifier();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(512);
				formalParameterList();
				}
			}

			setState(515);
			match(COLON);
			setState(516);
			resultType();
			setState(517);
			match(SEMI);
			setState(518);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_statement);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				label();
				setState(523);
				match(COLON);
				setState(524);
				unlabelledStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case ELSE:
			case END:
			case FOR:
			case GOTO:
			case IF:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case WITH:
			case SEMI:
			case AT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				unlabelledStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUnlabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUnlabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unlabelledStatement);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case SEMI:
			case AT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case REPEAT:
			case WHILE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				structuredStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_simpleStatement);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(536);
				emptyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			variable();
			setState(540);
			match(ASSIGN);
			setState(541);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PascalParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PascalParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PascalParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PascalParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PascalParser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(PascalParser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(PascalParser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(PascalParser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(PascalParser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PascalParser.DOT, i);
		}
		public List<TerminalNode> POINTER() { return getTokens(PascalParser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(PascalParser.POINTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(543);
				match(AT);
				setState(544);
				identifier();
				}
				break;
			case IDENT:
				{
				setState(545);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << LBRACK2) | (1L << POINTER) | (1L << DOT))) != 0)) {
				{
				setState(573);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(548);
					match(LBRACK);
					setState(549);
					expression();
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(550);
						match(COMMA);
						setState(551);
						expression();
						}
						}
						setState(556);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(557);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(559);
					match(LBRACK2);
					setState(560);
					expression();
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(561);
						match(COMMA);
						setState(562);
						expression();
						}
						}
						setState(567);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(568);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(570);
					match(DOT);
					setState(571);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(572);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(PascalParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PascalParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(PascalParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(PascalParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LT() { return getTokens(PascalParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PascalParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(PascalParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(PascalParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(PascalParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(PascalParser.GE, i);
		}
		public List<TerminalNode> GT() { return getTokens(PascalParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PascalParser.GT, i);
		}
		public List<TerminalNode> IN() { return getTokens(PascalParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(PascalParser.IN, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			simpleExpression();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				{
				setState(579);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(580);
				simpleExpression();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PascalParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PascalParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PascalParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PascalParser.MINUS, i);
		}
		public List<TerminalNode> OR() { return getTokens(PascalParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PascalParser.OR, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			term();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(587);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(588);
				term();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PascalParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PascalParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PascalParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PascalParser.SLASH, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PascalParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PascalParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(PascalParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(PascalParser.MOD, i);
		}
		public List<TerminalNode> AND() { return getTokens(PascalParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PascalParser.AND, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			signedFactor();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(595);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(596);
				signedFactor();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(602);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(605);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_factor);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(LPAREN);
				setState(609);
				expression();
				setState(610);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(614);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(615);
				match(NOT);
				setState(616);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(PascalParser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unsignedConstant);
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				match(NIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFunctionDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			identifier();
			setState(626);
			match(LPAREN);
			setState(627);
			parameterList();
			setState(628);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			actualParameter();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(631);
				match(COMMA);
				setState(632);
				actualParameter();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public TerminalNode LBRACK2() { return getToken(PascalParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(PascalParser.RBRACK2, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_set);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(LBRACK);
				setState(639);
				elementList();
				setState(640);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(LBRACK2);
				setState(643);
				elementList();
				setState(644);
				match(RBRACK2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementList);
		int _la;
		try {
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
			case NIL:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case AT:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				element();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(649);
					match(COMMA);
					setState(650);
					element();
					}
					}
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
			case RBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			expression();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(660);
				match(DOTDOT);
				setState(661);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			identifier();
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(665);
				match(LPAREN);
				setState(666);
				parameterList();
				setState(667);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_actualParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(PascalParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(GOTO);
			setState(674);
			label();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_structuredStatement);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				withStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(BEGIN);
			setState(687);
			statements();
			setState(688);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			statement();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(691);
				match(SEMI);
				setState(692);
				statement();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_conditionalStatement);
		try {
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				caseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(IF);
			setState(703);
			expression();
			setState(704);
			match(THEN);
			setState(705);
			statement();
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(706);
				match(ELSE);
				setState(707);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(CASE);
			setState(711);
			expression();
			setState(712);
			match(OF);
			setState(713);
			caseListElement();
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(714);
					match(SEMI);
					setState(715);
					caseListElement();
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(721);
				match(SEMI);
				setState(722);
				match(ELSE);
				setState(723);
				statements();
				}
			}

			setState(726);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitCaseListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitCaseListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			constList();
			setState(729);
			match(COLON);
			setState(730);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitRepetetiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitRepetetiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_repetetiveStatement);
		try {
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(734);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(WHILE);
			setState(738);
			expression();
			setState(739);
			match(DO);
			setState(740);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(PascalParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(PascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(REPEAT);
			setState(743);
			statements();
			setState(744);
			match(UNTIL);
			setState(745);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PascalParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(FOR);
			setState(748);
			identifier();
			setState(749);
			match(ASSIGN);
			setState(750);
			forList();
			setState(751);
			match(DO);
			setState(752);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(PascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			initialValue();
			setState(755);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(756);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PascalParser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(WITH);
			setState(763);
			recordVariableList();
			setState(764);
			match(DO);
			setState(765);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordVariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener) ((PascalListener)listener).exitRecordVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor) return ((PascalVisitor<? extends T>)visitor).visitRecordVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			variable();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(768);
				match(COMMA);
				setState(769);
				variable();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u030a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\5\2\u00bd"+
		"\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c8\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\u00d0\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00db\n"+
		"\5\f\5\16\5\u00de\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ea"+
		"\n\7\f\7\16\7\u00ed\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\6\t\u00f7\n\t"+
		"\r\t\16\t\u00f8\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010e\n\f\3\r\3\r\5\r\u0112\n\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u0120\n\22"+
		"\r\22\16\22\u0121\3\23\3\23\3\23\3\23\3\23\5\23\u0129\n\23\3\24\3\24\5"+
		"\24\u012d\n\24\3\24\3\24\3\24\3\25\3\25\5\25\u0134\n\25\3\26\3\26\3\26"+
		"\5\26\u0139\n\26\3\27\3\27\3\27\3\27\5\27\u013f\n\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u014b\n\32\3\33\3\33\3\33\5\33"+
		"\u0150\n\33\3\34\3\34\3\34\3\34\5\34\u0156\n\34\3\35\3\35\3\35\3\35\5"+
		"\35\u015c\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u016e\n\36\3\37\3\37\3\37\7\37\u0173\n"+
		"\37\f\37\16\37\u0176\13\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0183"+
		"\n#\3#\5#\u0186\n#\3$\3$\3$\7$\u018b\n$\f$\16$\u018e\13$\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\7&\u019a\n&\f&\16&\u019d\13&\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u01a4\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\5+\u01b6\n"+
		"+\3,\3,\3,\3-\3-\3-\3-\7-\u01bf\n-\f-\16-\u01c2\13-\3-\3-\3.\3.\3.\3."+
		"\3/\3/\3/\3\60\3\60\5\60\u01cf\n\60\3\61\3\61\3\61\5\61\u01d4\n\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u01dd\n\62\f\62\16\62\u01e0\13\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01eb\n\63\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\7\65\u01f4\n\65\f\65\16\65\u01f7\13\65\3\66"+
		"\3\66\3\66\7\66\u01fc\n\66\f\66\16\66\u01ff\13\66\3\67\3\67\3\67\5\67"+
		"\u0204\n\67\3\67\3\67\3\67\3\67\3\67\38\38\39\39\39\39\39\59\u0212\n9"+
		"\3:\3:\5:\u0216\n:\3;\3;\3;\3;\5;\u021c\n;\3<\3<\3<\3<\3=\3=\3=\5=\u0225"+
		"\n=\3=\3=\3=\3=\7=\u022b\n=\f=\16=\u022e\13=\3=\3=\3=\3=\3=\3=\7=\u0236"+
		"\n=\f=\16=\u0239\13=\3=\3=\3=\3=\3=\7=\u0240\n=\f=\16=\u0243\13=\3>\3"+
		">\3>\7>\u0248\n>\f>\16>\u024b\13>\3?\3?\3?\7?\u0250\n?\f?\16?\u0253\13"+
		"?\3@\3@\3@\7@\u0258\n@\f@\16@\u025b\13@\3A\5A\u025e\nA\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\5B\u026c\nB\3C\3C\3C\3C\5C\u0272\nC\3D\3D\3D\3D"+
		"\3D\3E\3E\3E\7E\u027c\nE\fE\16E\u027f\13E\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0289"+
		"\nF\3G\3G\3G\7G\u028e\nG\fG\16G\u0291\13G\3G\5G\u0294\nG\3H\3H\3H\5H\u0299"+
		"\nH\3I\3I\3I\3I\3I\5I\u02a0\nI\3J\3J\3K\3K\3K\3L\3L\3M\3M\3N\3N\3N\3N"+
		"\5N\u02af\nN\3O\3O\3O\3O\3P\3P\3P\7P\u02b8\nP\fP\16P\u02bb\13P\3Q\3Q\5"+
		"Q\u02bf\nQ\3R\3R\3R\3R\3R\3R\5R\u02c7\nR\3S\3S\3S\3S\3S\3S\7S\u02cf\n"+
		"S\fS\16S\u02d2\13S\3S\3S\3S\5S\u02d7\nS\3S\3S\3T\3T\3T\3T\3U\3U\3U\5U"+
		"\u02e2\nU\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y"+
		"\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\7]\u0305\n]\f]\16]\u0308"+
		"\13]\3]\2\2^\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\2\b\3\2+,\7\2\6\6\b\b\26\26  HH\4\2\25\25\638\4\2\34\34+,\6\2\3\3\13"+
		"\13\30\30-.\4\2\r\r%%\2\u030a\2\u00ba\3\2\2\2\4\u00cf\3\2\2\2\6\u00d1"+
		"\3\2\2\2\b\u00dc\3\2\2\2\n\u00e1\3\2\2\2\f\u00e5\3\2\2\2\16\u00f0\3\2"+
		"\2\2\20\u00f2\3\2\2\2\22\u00fa\3\2\2\2\24\u00fe\3\2\2\2\26\u010d\3\2\2"+
		"\2\30\u0111\3\2\2\2\32\u0113\3\2\2\2\34\u0115\3\2\2\2\36\u0117\3\2\2\2"+
		" \u0119\3\2\2\2\"\u011b\3\2\2\2$\u0123\3\2\2\2&\u012a\3\2\2\2(\u0131\3"+
		"\2\2\2*\u0138\3\2\2\2,\u013e\3\2\2\2.\u0140\3\2\2\2\60\u0144\3\2\2\2\62"+
		"\u014a\3\2\2\2\64\u014f\3\2\2\2\66\u0155\3\2\2\28\u0157\3\2\2\2:\u016d"+
		"\3\2\2\2<\u016f\3\2\2\2>\u0177\3\2\2\2@\u0179\3\2\2\2B\u017b\3\2\2\2D"+
		"\u0185\3\2\2\2F\u0187\3\2\2\2H\u018f\3\2\2\2J\u0193\3\2\2\2L\u01a3\3\2"+
		"\2\2N\u01a5\3\2\2\2P\u01ab\3\2\2\2R\u01af\3\2\2\2T\u01b5\3\2\2\2V\u01b7"+
		"\3\2\2\2X\u01ba\3\2\2\2Z\u01c5\3\2\2\2\\\u01c9\3\2\2\2^\u01ce\3\2\2\2"+
		"`\u01d0\3\2\2\2b\u01d8\3\2\2\2d\u01ea\3\2\2\2f\u01ec\3\2\2\2h\u01f0\3"+
		"\2\2\2j\u01f8\3\2\2\2l\u0200\3\2\2\2n\u020a\3\2\2\2p\u0211\3\2\2\2r\u0215"+
		"\3\2\2\2t\u021b\3\2\2\2v\u021d\3\2\2\2x\u0224\3\2\2\2z\u0244\3\2\2\2|"+
		"\u024c\3\2\2\2~\u0254\3\2\2\2\u0080\u025d\3\2\2\2\u0082\u026b\3\2\2\2"+
		"\u0084\u0271\3\2\2\2\u0086\u0273\3\2\2\2\u0088\u0278\3\2\2\2\u008a\u0288"+
		"\3\2\2\2\u008c\u0293\3\2\2\2\u008e\u0295\3\2\2\2\u0090\u029a\3\2\2\2\u0092"+
		"\u02a1\3\2\2\2\u0094\u02a3\3\2\2\2\u0096\u02a6\3\2\2\2\u0098\u02a8\3\2"+
		"\2\2\u009a\u02ae\3\2\2\2\u009c\u02b0\3\2\2\2\u009e\u02b4\3\2\2\2\u00a0"+
		"\u02be\3\2\2\2\u00a2\u02c0\3\2\2\2\u00a4\u02c8\3\2\2\2\u00a6\u02da\3\2"+
		"\2\2\u00a8\u02e1\3\2\2\2\u00aa\u02e3\3\2\2\2\u00ac\u02e8\3\2\2\2\u00ae"+
		"\u02ed\3\2\2\2\u00b0\u02f4\3\2\2\2\u00b2\u02f8\3\2\2\2\u00b4\u02fa\3\2"+
		"\2\2\u00b6\u02fc\3\2\2\2\u00b8\u0301\3\2\2\2\u00ba\u00bc\5\4\3\2\u00bb"+
		"\u00bd\7F\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0\7A\2\2\u00c0\3\3\2\2\2\u00c1\u00c2"+
		"\7\37\2\2\u00c2\u00c7\5\6\4\2\u00c3\u00c4\79\2\2\u00c4\u00c5\5h\65\2\u00c5"+
		"\u00c6\7:\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00d0\3\2\2\2\u00cb"+
		"\u00cc\7E\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7\61\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00c1\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\5\3\2\2\2\u00d1\u00d2"+
		"\7M\2\2\u00d2\7\3\2\2\2\u00d3\u00db\5\f\7\2\u00d4\u00db\5\20\t\2\u00d5"+
		"\u00db\5\"\22\2\u00d6\u00db\5X-\2\u00d7\u00db\5\\/\2\u00d8\u00db\5\n\6"+
		"\2\u00d9\u00db\7I\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d5"+
		"\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5\u009cO\2\u00e0"+
		"\t\3\2\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e3\5h\65\2\u00e3\u00e4\7\61\2\2"+
		"\u00e4\13\3\2\2\2\u00e5\u00e6\7\27\2\2\u00e6\u00eb\5\16\b\2\u00e7\u00e8"+
		"\7\60\2\2\u00e8\u00ea\5\16\b\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\r\3\2\2\2\u00f0\u00f1\5\32\16\2\u00f1"+
		"\17\3\2\2\2\u00f2\u00f6\7\n\2\2\u00f3\u00f4\5\22\n\2\u00f4\u00f5\7\61"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\21\3\2\2\2\u00fa\u00fb\5\6\4"+
		"\2\u00fb\u00fc\7\63\2\2\u00fc\u00fd\5\26\f\2\u00fd\23\3\2\2\2\u00fe\u00ff"+
		"\7\t\2\2\u00ff\u0100\79\2\2\u0100\u0101\5\32\16\2\u0101\u0102\7:\2\2\u0102"+
		"\25\3\2\2\2\u0103\u010e\5\30\r\2\u0104\u0105\5\36\20\2\u0105\u0106\5\30"+
		"\r\2\u0106\u010e\3\2\2\2\u0107\u010e\5\6\4\2\u0108\u0109\5\36\20\2\u0109"+
		"\u010a\5\6\4\2\u010a\u010e\3\2\2\2\u010b\u010e\5 \21\2\u010c\u010e\5\24"+
		"\13\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0107\3\2\2\2\u010d"+
		"\u0108\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\27\3\2\2"+
		"\2\u010f\u0112\5\32\16\2\u0110\u0112\5\34\17\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\31\3\2\2\2\u0113\u0114\7O\2\2\u0114\33\3\2\2\2\u0115"+
		"\u0116\7O\2\2\u0116\35\3\2\2\2\u0117\u0118\t\2\2\2\u0118\37\3\2\2\2\u0119"+
		"\u011a\7N\2\2\u011a!\3\2\2\2\u011b\u011f\7&\2\2\u011c\u011d\5$\23\2\u011d"+
		"\u011e\7\61\2\2\u011e\u0120\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0121\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122#\3\2\2\2\u0123\u0124"+
		"\5\6\4\2\u0124\u0128\7\63\2\2\u0125\u0129\5*\26\2\u0126\u0129\5&\24\2"+
		"\u0127\u0129\5(\25\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127"+
		"\3\2\2\2\u0129%\3\2\2\2\u012a\u012c\7\22\2\2\u012b\u012d\5b\62\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\62"+
		"\2\2\u012f\u0130\5n8\2\u0130\'\3\2\2\2\u0131\u0133\7\36\2\2\u0132\u0134"+
		"\5b\62\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134)\3\2\2\2\u0135"+
		"\u0139\5,\27\2\u0136\u0139\5\64\33\2\u0137\u0139\5V,\2\u0138\u0135\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139+\3\2\2\2\u013a\u013f"+
		"\5.\30\2\u013b\u013f\5\60\31\2\u013c\u013f\5\62\32\2\u013d\u013f\58\35"+
		"\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d"+
		"\3\2\2\2\u013f-\3\2\2\2\u0140\u0141\79\2\2\u0141\u0142\5h\65\2\u0142\u0143"+
		"\7:\2\2\u0143/\3\2\2\2\u0144\u0145\5\26\f\2\u0145\u0146\7B\2\2\u0146\u0147"+
		"\5\26\f\2\u0147\61\3\2\2\2\u0148\u014b\5\6\4\2\u0149\u014b\t\3\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\63\3\2\2\2\u014c\u014d\7\35\2"+
		"\2\u014d\u0150\5\66\34\2\u014e\u0150\5\66\34\2\u014f\u014c\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\65\3\2\2\2\u0151\u0156\5:\36\2\u0152\u0156\5B\"\2"+
		"\u0153\u0156\5P)\2\u0154\u0156\5T+\2\u0155\u0151\3\2\2\2\u0155\u0152\3"+
		"\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\67\3\2\2\2\u0157"+
		"\u0158\7H\2\2\u0158\u015b\7;\2\2\u0159\u015c\5\6\4\2\u015a\u015c\5\30"+
		"\r\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\7=\2\2\u015e9\3\2\2\2\u015f\u0160\7\4\2\2\u0160\u0161\7;\2\2\u0161"+
		"\u0162\5<\37\2\u0162\u0163\7=\2\2\u0163\u0164\7\33\2\2\u0164\u0165\5@"+
		"!\2\u0165\u016e\3\2\2\2\u0166\u0167\7\4\2\2\u0167\u0168\7<\2\2\u0168\u0169"+
		"\5<\37\2\u0169\u016a\7>\2\2\u016a\u016b\7\33\2\2\u016b\u016c\5@!\2\u016c"+
		"\u016e\3\2\2\2\u016d\u015f\3\2\2\2\u016d\u0166\3\2\2\2\u016e;\3\2\2\2"+
		"\u016f\u0174\5> \2\u0170\u0171\7\60\2\2\u0171\u0173\5> \2\u0172\u0170"+
		"\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"=\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\5,\27\2\u0178?\3\2\2\2\u0179"+
		"\u017a\5*\26\2\u017aA\3\2\2\2\u017b\u017c\7!\2\2\u017c\u017d\5D#\2\u017d"+
		"\u017e\7\17\2\2\u017eC\3\2\2\2\u017f\u0182\5F$\2\u0180\u0181\7\61\2\2"+
		"\u0181\u0183\5J&\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0186\5J&\2\u0185\u017f\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"E\3\2\2\2\u0187\u018c\5H%\2\u0188\u0189\7\61\2\2\u0189\u018b\5H%\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018dG\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\5h\65\2\u0190\u0191"+
		"\7\62\2\2\u0191\u0192\5*\26\2\u0192I\3\2\2\2\u0193\u0194\7\7\2\2\u0194"+
		"\u0195\5L\'\2\u0195\u0196\7\33\2\2\u0196\u019b\5N(\2\u0197\u0198\7\61"+
		"\2\2\u0198\u019a\5N(\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019cK\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u019f\5\6\4\2\u019f\u01a0\7\62\2\2\u01a0\u01a1\5\62\32\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a4\5\62\32\2\u01a3\u019e\3\2\2\2\u01a3\u01a2\3\2\2\2"+
		"\u01a4M\3\2\2\2\u01a5\u01a6\5j\66\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8\7"+
		"9\2\2\u01a8\u01a9\5D#\2\u01a9\u01aa\7:\2\2\u01aaO\3\2\2\2\u01ab\u01ac"+
		"\7#\2\2\u01ac\u01ad\7\33\2\2\u01ad\u01ae\5R*\2\u01aeQ\3\2\2\2\u01af\u01b0"+
		"\5,\27\2\u01b0S\3\2\2\2\u01b1\u01b2\7\20\2\2\u01b2\u01b3\7\33\2\2\u01b3"+
		"\u01b6\5*\26\2\u01b4\u01b6\7\20\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b4\3"+
		"\2\2\2\u01b6U\3\2\2\2\u01b7\u01b8\7?\2\2\u01b8\u01b9\5\62\32\2\u01b9W"+
		"\3\2\2\2\u01ba\u01bb\7(\2\2\u01bb\u01c0\5Z.\2\u01bc\u01bd\7\61\2\2\u01bd"+
		"\u01bf\5Z.\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4"+
		"\7\61\2\2\u01c4Y\3\2\2\2\u01c5\u01c6\5h\65\2\u01c6\u01c7\7\62\2\2\u01c7"+
		"\u01c8\5*\26\2\u01c8[\3\2\2\2\u01c9\u01ca\5^\60\2\u01ca\u01cb\7\61\2\2"+
		"\u01cb]\3\2\2\2\u01cc\u01cf\5`\61\2\u01cd\u01cf\5l\67\2\u01ce\u01cc\3"+
		"\2\2\2\u01ce\u01cd\3\2\2\2\u01cf_\3\2\2\2\u01d0\u01d1\7\36\2\2\u01d1\u01d3"+
		"\5\6\4\2\u01d2\u01d4\5b\62\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01d7\5\b\5\2\u01d7a\3\2\2\2"+
		"\u01d8\u01d9\79\2\2\u01d9\u01de\5d\63\2\u01da\u01db\7\61\2\2\u01db\u01dd"+
		"\5d\63\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7:"+
		"\2\2\u01e2c\3\2\2\2\u01e3\u01eb\5f\64\2\u01e4\u01e5\7(\2\2\u01e5\u01eb"+
		"\5f\64\2\u01e6\u01e7\7\22\2\2\u01e7\u01eb\5f\64\2\u01e8\u01e9\7\36\2\2"+
		"\u01e9\u01eb\5f\64\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea\u01e6"+
		"\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ebe\3\2\2\2\u01ec\u01ed\5h\65\2\u01ed"+
		"\u01ee\7\62\2\2\u01ee\u01ef\5\62\32\2\u01efg\3\2\2\2\u01f0\u01f5\5\6\4"+
		"\2\u01f1\u01f2\7\60\2\2\u01f2\u01f4\5\6\4\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6i\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f8\u01fd\5\26\f\2\u01f9\u01fa\7\60\2\2\u01fa\u01fc"+
		"\5\26\f\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2"+
		"\u01fd\u01fe\3\2\2\2\u01fek\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7"+
		"\22\2\2\u0201\u0203\5\6\4\2\u0202\u0204\5b\62\2\u0203\u0202\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\62\2\2\u0206\u0207\5"+
		"n8\2\u0207\u0208\7\61\2\2\u0208\u0209\5\b\5\2\u0209m\3\2\2\2\u020a\u020b"+
		"\5\62\32\2\u020bo\3\2\2\2\u020c\u020d\5\16\b\2\u020d\u020e\7\62\2\2\u020e"+
		"\u020f\5r:\2\u020f\u0212\3\2\2\2\u0210\u0212\5r:\2\u0211\u020c\3\2\2\2"+
		"\u0211\u0210\3\2\2\2\u0212q\3\2\2\2\u0213\u0216\5t;\2\u0214\u0216\5\u009a"+
		"N\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216s\3\2\2\2\u0217\u021c"+
		"\5v<\2\u0218\u021c\5\u0090I\2\u0219\u021c\5\u0094K\2\u021a\u021c\5\u0096"+
		"L\2\u021b\u0217\3\2\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021a\3\2\2\2\u021cu\3\2\2\2\u021d\u021e\5x=\2\u021e\u021f\7/\2\2\u021f"+
		"\u0220\5z>\2\u0220w\3\2\2\2\u0221\u0222\7@\2\2\u0222\u0225\5\6\4\2\u0223"+
		"\u0225\5\6\4\2\u0224\u0221\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0241\3\2"+
		"\2\2\u0226\u0227\7;\2\2\u0227\u022c\5z>\2\u0228\u0229\7\60\2\2\u0229\u022b"+
		"\5z>\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\7="+
		"\2\2\u0230\u0240\3\2\2\2\u0231\u0232\7<\2\2\u0232\u0237\5z>\2\u0233\u0234"+
		"\7\60\2\2\u0234\u0236\5z>\2\u0235\u0233\3\2\2\2\u0236\u0239\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0237\3\2"+
		"\2\2\u023a\u023b\7>\2\2\u023b\u0240\3\2\2\2\u023c\u023d\7A\2\2\u023d\u0240"+
		"\5\6\4\2\u023e\u0240\7?\2\2\u023f\u0226\3\2\2\2\u023f\u0231\3\2\2\2\u023f"+
		"\u023c\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242y\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0249"+
		"\5|?\2\u0245\u0246\t\4\2\2\u0246\u0248\5|?\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a{\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u0251\5~@\2\u024d\u024e\t\5\2\2\u024e\u0250"+
		"\5~@\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252}\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0259\5\u0080"+
		"A\2\u0255\u0256\t\6\2\2\u0256\u0258\5\u0080A\2\u0257\u0255\3\2\2\2\u0258"+
		"\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\177\3\2\2"+
		"\2\u025b\u0259\3\2\2\2\u025c\u025e\t\2\2\2\u025d\u025c\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5\u0082B\2\u0260\u0081\3\2\2"+
		"\2\u0261\u026c\5x=\2\u0262\u0263\79\2\2\u0263\u0264\5z>\2\u0264\u0265"+
		"\7:\2\2\u0265\u026c\3\2\2\2\u0266\u026c\5\u0086D\2\u0267\u026c\5\u0084"+
		"C\2\u0268\u026c\5\u008aF\2\u0269\u026a\7\32\2\2\u026a\u026c\5\u0082B\2"+
		"\u026b\u0261\3\2\2\2\u026b\u0262\3\2\2\2\u026b\u0266\3\2\2\2\u026b\u0267"+
		"\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u0083\3\2\2\2\u026d"+
		"\u0272\5\30\r\2\u026e\u0272\5\24\13\2\u026f\u0272\5 \21\2\u0270\u0272"+
		"\7\31\2\2\u0271\u026d\3\2\2\2\u0271\u026e\3\2\2\2\u0271\u026f\3\2\2\2"+
		"\u0271\u0270\3\2\2\2\u0272\u0085\3\2\2\2\u0273\u0274\5\6\4\2\u0274\u0275"+
		"\79\2\2\u0275\u0276\5\u0088E\2\u0276\u0277\7:\2\2\u0277\u0087\3\2\2\2"+
		"\u0278\u027d\5\u0092J\2\u0279\u027a\7\60\2\2\u027a\u027c\5\u0092J\2\u027b"+
		"\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2"+
		"\2\2\u027e\u0089\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\7;\2\2\u0281"+
		"\u0282\5\u008cG\2\u0282\u0283\7=\2\2\u0283\u0289\3\2\2\2\u0284\u0285\7"+
		"<\2\2\u0285\u0286\5\u008cG\2\u0286\u0287\7>\2\2\u0287\u0289\3\2\2\2\u0288"+
		"\u0280\3\2\2\2\u0288\u0284\3\2\2\2\u0289\u008b\3\2\2\2\u028a\u028f\5\u008e"+
		"H\2\u028b\u028c\7\60\2\2\u028c\u028e\5\u008eH\2\u028d\u028b\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\3\2"+
		"\2\2\u0291\u028f\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u028a\3\2\2\2\u0293"+
		"\u0292\3\2\2\2\u0294\u008d\3\2\2\2\u0295\u0298\5z>\2\u0296\u0297\7B\2"+
		"\2\u0297\u0299\5z>\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u008f"+
		"\3\2\2\2\u029a\u029f\5\6\4\2\u029b\u029c\79\2\2\u029c\u029d\5\u0088E\2"+
		"\u029d\u029e\7:\2\2\u029e\u02a0\3\2\2\2\u029f\u029b\3\2\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u0091\3\2\2\2\u02a1\u02a2\5z>\2\u02a2\u0093\3\2\2\2\u02a3"+
		"\u02a4\7\23\2\2\u02a4\u02a5\5\16\b\2\u02a5\u0095\3\2\2\2\u02a6\u02a7\3"+
		"\2\2\2\u02a7\u0097\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u0099\3\2\2\2\u02aa"+
		"\u02af\5\u009cO\2\u02ab\u02af\5\u00a0Q\2\u02ac\u02af\5\u00a8U\2\u02ad"+
		"\u02af\5\u00b6\\\2\u02ae\u02aa\3\2\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac"+
		"\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af\u009b\3\2\2\2\u02b0\u02b1\7\5\2\2\u02b1"+
		"\u02b2\5\u009eP\2\u02b2\u02b3\7\17\2\2\u02b3\u009d\3\2\2\2\u02b4\u02b9"+
		"\5p9\2\u02b5\u02b6\7\61\2\2\u02b6\u02b8\5p9\2\u02b7\u02b5\3\2\2\2\u02b8"+
		"\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u009f\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bf\5\u00a2R\2\u02bd\u02bf\5\u00a4S\2"+
		"\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2\2\2\u02bf\u00a1\3\2\2\2\u02c0\u02c1"+
		"\7\24\2\2\u02c1\u02c2\5z>\2\u02c2\u02c3\7$\2\2\u02c3\u02c6\5p9\2\u02c4"+
		"\u02c5\7\16\2\2\u02c5\u02c7\5p9\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u00a3\3\2\2\2\u02c8\u02c9\7\7\2\2\u02c9\u02ca\5z>\2\u02ca\u02cb"+
		"\7\33\2\2\u02cb\u02d0\5\u00a6T\2\u02cc\u02cd\7\61\2\2\u02cd\u02cf\5\u00a6"+
		"T\2\u02ce\u02cc\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d6\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7\61"+
		"\2\2\u02d4\u02d5\7\16\2\2\u02d5\u02d7\5\u009eP\2\u02d6\u02d3\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\7\17\2\2\u02d9\u00a5\3"+
		"\2\2\2\u02da\u02db\5j\66\2\u02db\u02dc\7\62\2\2\u02dc\u02dd\5p9\2\u02dd"+
		"\u00a7\3\2\2\2\u02de\u02e2\5\u00aaV\2\u02df\u02e2\5\u00acW\2\u02e0\u02e2"+
		"\5\u00aeX\2\u02e1\u02de\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1\u02e0\3\2\2"+
		"\2\u02e2\u00a9\3\2\2\2\u02e3\u02e4\7)\2\2\u02e4\u02e5\5z>\2\u02e5\u02e6"+
		"\7\f\2\2\u02e6\u02e7\5p9\2\u02e7\u00ab\3\2\2\2\u02e8\u02e9\7\"\2\2\u02e9"+
		"\u02ea\5\u009eP\2\u02ea\u02eb\7\'\2\2\u02eb\u02ec\5z>\2\u02ec\u00ad\3"+
		"\2\2\2\u02ed\u02ee\7\21\2\2\u02ee\u02ef\5\6\4\2\u02ef\u02f0\7/\2\2\u02f0"+
		"\u02f1\5\u00b0Y\2\u02f1\u02f2\7\f\2\2\u02f2\u02f3\5p9\2\u02f3\u00af\3"+
		"\2\2\2\u02f4\u02f5\5\u00b2Z\2\u02f5\u02f6\t\7\2\2\u02f6\u02f7\5\u00b4"+
		"[\2\u02f7\u00b1\3\2\2\2\u02f8\u02f9\5z>\2\u02f9\u00b3\3\2\2\2\u02fa\u02fb"+
		"\5z>\2\u02fb\u00b5\3\2\2\2\u02fc\u02fd\7*\2\2\u02fd\u02fe\5\u00b8]\2\u02fe"+
		"\u02ff\7\f\2\2\u02ff\u0300\5p9\2\u0300\u00b7\3\2\2\2\u0301\u0306\5x=\2"+
		"\u0302\u0303\7\60\2\2\u0303\u0305\5x=\2\u0304\u0302\3\2\2\2\u0305\u0308"+
		"\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u00b9\3\2\2\2\u0308"+
		"\u0306\3\2\2\2A\u00bc\u00c7\u00cf\u00da\u00dc\u00eb\u00f8\u010d\u0111"+
		"\u0121\u0128\u012c\u0133\u0138\u013e\u014a\u014f\u0155\u015b\u016d\u0174"+
		"\u0182\u0185\u018c\u019b\u01a3\u01b5\u01c0\u01ce\u01d3\u01de\u01ea\u01f5"+
		"\u01fd\u0203\u0211\u0215\u021b\u0224\u022c\u0237\u023f\u0241\u0249\u0251"+
		"\u0259\u025d\u026b\u0271\u027d\u0288\u028f\u0293\u0298\u029f\u02ae\u02b9"+
		"\u02be\u02c6\u02d0\u02d6\u02e1\u0306";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}