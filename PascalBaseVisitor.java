
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * This class provides an empty implementation of {@link PascalVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class PascalBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements PascalVisitor<T> {
    private final Map<String, Variable> variables;

    private final List<String> lines;


    public PascalBaseVisitor() {
        this.variables = new HashMap<String, Variable>();
        this.lines = new ArrayList<String>();
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProgram(PascalParser.ProgramContext ctx) {
//        System.out.println("visitProgram");
//        System.out.println(ctx.getChild(0));
//        System.out.println(ctx.getChild(1));
//        System.out.println(ctx.getChild(2));
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProgramHeading(PascalParser.ProgramHeadingContext ctx) {
//        System.out.println("visitProgramHeading");
//        System.out.println(ctx.getChild(0));
//        System.out.println(ctx.getChild(1));
//        System.out.println(ctx.getChild(2));
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIdentifier(PascalParser.IdentifierContext ctx) {
//        System.out.println("visitIdentifier");
//        System.out.println(ctx.getChild(0));
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitBlock(PascalParser.BlockContext ctx) {
        System.out.println("visitBlock");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUsesUnitsPart(PascalParser.UsesUnitsPartContext ctx) {
        System.out.println("visitUsesUnitsPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLabelDeclarationPart(PascalParser.LabelDeclarationPartContext ctx) {
        System.out.println("visitLabelDeclarationPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLabel(PascalParser.LabelContext ctx) {
        System.out.println("visitLabel");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstantDefinitionPart(PascalParser.ConstantDefinitionPartContext ctx) {
        System.out.println("visitConstantDefinitionPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstantDefinition(PascalParser.ConstantDefinitionContext ctx) {
        System.out.println("visitConstantDefinition");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstantChr(PascalParser.ConstantChrContext ctx) {
        System.out.println("visitConstantChr");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstant(PascalParser.ConstantContext ctx) {
        System.out.println("visitConstant");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedNumber(PascalParser.UnsignedNumberContext ctx) {
//        System.out.println("visitUnsignedNumber");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedInteger(PascalParser.UnsignedIntegerContext ctx) {
//        System.out.println("visitUnsignedInteger");
        lines.add("SIPUCH  " + ctx.getChild(0).getText());
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedReal(PascalParser.UnsignedRealContext ctx) {
        System.out.println("visitUnsignedReal");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSign(PascalParser.SignContext ctx) {
        System.out.println("visitSign");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitString(PascalParser.StringContext ctx) {
        System.out.println("visitString");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeDefinitionPart(PascalParser.TypeDefinitionPartContext ctx) {
        System.out.println("visitTypeDefinitionPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeDefinition(PascalParser.TypeDefinitionContext ctx) {
        System.out.println("visitTypeDefinition");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFunctionType(PascalParser.FunctionTypeContext ctx) {
        System.out.println("visitFunctionType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureType(PascalParser.ProcedureTypeContext ctx) {
        System.out.println("visitProcedureType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitType(PascalParser.TypeContext ctx) {
        System.out.println("visitType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSimpleType(PascalParser.SimpleTypeContext ctx) {
        System.out.println("visitSimpleType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitScalarType(PascalParser.ScalarTypeContext ctx) {
        System.out.println("visitScalarType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSubrangeType(PascalParser.SubrangeTypeContext ctx) {
        System.out.println("visitSubrangeType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeIdentifier(PascalParser.TypeIdentifierContext ctx) {
        System.out.println("visitTypeIdentifier");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStructuredType(PascalParser.StructuredTypeContext ctx) {
        System.out.println("visitStructuredType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnpackedStructuredType(PascalParser.UnpackedStructuredTypeContext ctx) {
        System.out.println("visitUnpackedStructuredType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStringtype(PascalParser.StringtypeContext ctx) {
        System.out.println("visitStringtype");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitArrayType(PascalParser.ArrayTypeContext ctx) {
        System.out.println("visitArrayType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTypeList(PascalParser.TypeListContext ctx) {
        System.out.println("visitTypeList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIndexType(PascalParser.IndexTypeContext ctx) {
        System.out.println("visitIndexType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitComponentType(PascalParser.ComponentTypeContext ctx) {
        System.out.println("visitComponentType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRecordType(PascalParser.RecordTypeContext ctx) {
        System.out.println("visitRecordType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFieldList(PascalParser.FieldListContext ctx) {
        System.out.println("visitFieldList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFixedPart(PascalParser.FixedPartContext ctx) {
        System.out.println("visitFixedPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRecordSection(PascalParser.RecordSectionContext ctx) {
        System.out.println("visitRecordSection");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariantPart(PascalParser.VariantPartContext ctx) {
        System.out.println("visitVariantPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTag(PascalParser.TagContext ctx) {
        System.out.println("visitTag");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariant(PascalParser.VariantContext ctx) {
        System.out.println("visitVariant");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSetType(PascalParser.SetTypeContext ctx) {
        System.out.println("visitSetType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitBaseType(PascalParser.BaseTypeContext ctx) {
        System.out.println("visitBaseType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFileType(PascalParser.FileTypeContext ctx) {
        System.out.println("visitFileType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitPointerType(PascalParser.PointerTypeContext ctx) {
        System.out.println("visitPointerType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx) {
        System.out.println("visitVariableDeclarationPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariableDeclaration(PascalParser.VariableDeclarationContext ctx) {
        System.out.println("visitVariableDeclaration");
        System.out.println(ctx.getChild(0).getText());
        System.out.println(ctx.getChild(2).getText());
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureAndFunctionDeclarationPart(PascalParser.ProcedureAndFunctionDeclarationPartContext ctx) {
        System.out.println("visitProcedureAndFunctionDeclarationPart");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureOrFunctionDeclaration(PascalParser.ProcedureOrFunctionDeclarationContext ctx) {
        System.out.println("visitProcedureOrFunctionDeclaration");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureDeclaration(PascalParser.ProcedureDeclarationContext ctx) {
        System.out.println("visitProcedureDeclaration");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFormalParameterList(PascalParser.FormalParameterListContext ctx) {
        System.out.println("visitFormalParameterList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFormalParameterSection(PascalParser.FormalParameterSectionContext ctx) {
        System.out.println("visitFormalParameterSection");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitParameterGroup(PascalParser.ParameterGroupContext ctx) {
        System.out.println("visitParameterGroup");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIdentifierList(PascalParser.IdentifierListContext ctx) {
        System.out.println("visitIdentifierList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConstList(PascalParser.ConstListContext ctx) {
        System.out.println("visitConstList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFunctionDeclaration(PascalParser.FunctionDeclarationContext ctx) {
        System.out.println("visitFunctionDeclaration");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitResultType(PascalParser.ResultTypeContext ctx) {
        System.out.println("visitResultType");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStatement(PascalParser.StatementContext ctx) {
        System.out.println("visitStatement");
        System.out.println(ctx.getChild(0));
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnlabelledStatement(PascalParser.UnlabelledStatementContext ctx) {
        System.out.println("visitUnlabelledStatement");
        System.out.println(ctx.getChild(0));

        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSimpleStatement(PascalParser.SimpleStatementContext ctx) {
        System.out.println("visitSimpleStatement");
        System.out.println(ctx.getChild(0));
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitAssignmentStatement(PascalParser.AssignmentStatementContext ctx) {
//        System.out.println("visitAssignmentStatement");
        visit(ctx.getChild(2));
        visit(ctx.getChild(0));
        final Variable variable = variables.get(ctx.getChild(0).getText());
        lines.add(variable.getType() + "STORE " + variable.getId());

        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitVariable(PascalParser.VariableContext ctx) {
        final String var = ctx.getChild(0).getText();
        if (!variables.containsKey(var)) {
            variables.put(var, new Variable(variables.keySet().size() + 1, "I"));
        }
//        System.out.println("variable=" + var);
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitExpression(PascalParser.ExpressionContext ctx) {
        visit(ctx.getChild(0));
        for (int i = 1; i < (ctx.getChildCount() + 1) / 2; i++) {
            visit(ctx.getChild(i * 2));
            lines.add(ctx.getChild(i * 2 - 1).getText());
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSimpleExpression(PascalParser.SimpleExpressionContext ctx) {
//        System.out.println("visitSimpleExpression");
        visit(ctx.getChild(0));
        for (int i = 1; i < (ctx.getChildCount() + 1) / 2; i++) {
            visit(ctx.getChild(i * 2));
            lines.add(ctx.getChild(i * 2 - 1).getText());
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTerm(PascalParser.TermContext ctx) {
//        System.out.println("visitTerm");
        visit(ctx.getChild(0));
        for (int i = 1; i < (ctx.getChildCount() + 1) / 2; i++) {
            visit(ctx.getChild(i * 2));
            lines.add(ctx.getChild(i * 2 - 1).getText());
        }
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSignedFactor(PascalParser.SignedFactorContext ctx) {
//        System.out.println("visitSignedFactor");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFactor(PascalParser.FactorContext ctx) {
//        System.out.println("visitFactor");
        if (ctx.getChild(0) instanceof PascalParser.VariableContext) {
            final Variable variable = variables.get(ctx.getChild(0).getText());
            lines.add(variable.getType() + "LOAD   " + variable.getId());
            return null;
        } else {
            return visitChildren(ctx);
        }
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitUnsignedConstant(PascalParser.UnsignedConstantContext ctx) {
//        System.out.println("visitUnsignedConstant");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFunctionDesignator(PascalParser.FunctionDesignatorContext ctx) {
        System.out.println("visitFunctionDesignator");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitParameterList(PascalParser.ParameterListContext ctx) {
        System.out.println("visitParameterList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitSet(PascalParser.SetContext ctx) {
        System.out.println("visitSet");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitElementList(PascalParser.ElementListContext ctx) {
        System.out.println("visitElementList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitElement(PascalParser.ElementContext ctx) {
        System.out.println("visitElement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProcedureStatement(PascalParser.ProcedureStatementContext ctx) {
        System.out.println("visitProcedureStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitActualParameter(PascalParser.ActualParameterContext ctx) {
        System.out.println("visitActualParameter");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitGotoStatement(PascalParser.GotoStatementContext ctx) {
        System.out.println("visitGotoStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitEmptyStatement(PascalParser.EmptyStatementContext ctx) {
        System.out.println("visitEmptyStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitEmpty(PascalParser.EmptyContext ctx) {
        System.out.println("visitEmpty");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStructuredStatement(PascalParser.StructuredStatementContext ctx) {
        System.out.println("visitStructuredStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCompoundStatement(PascalParser.CompoundStatementContext ctx) {
        System.out.println("visitCompoundStatement");

        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStatements(PascalParser.StatementsContext ctx) {
        System.out.println("visitStatements");

        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitConditionalStatement(PascalParser.ConditionalStatementContext ctx) {
        System.out.println("visitConditionalStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitIfStatement(PascalParser.IfStatementContext ctx) {
        visit(ctx.getChild(1));
        final Integer line = lines.size() - 1;
        final ParseTree then = ctx.getChild(3);
        visit(then);
        lines.add("goto");
        final Integer thenLine = lines.size() - 1;
        final ParseTree eelse = ctx.getChild(5);
        if (eelse != null) {
            final String s1 = lines.get(line) + "   " + lines.size();
            lines.remove(lines.get(line));
            lines.add(line, s1);
            visit(eelse);
        }

        final String s2 = lines.get(thenLine) + "   " + lines.size();
        lines.remove(lines.get(thenLine));
        lines.add(thenLine, s2);
        return null;
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCaseStatement(PascalParser.CaseStatementContext ctx) {
        System.out.println("visitCaseStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitCaseListElement(PascalParser.CaseListElementContext ctx) {
        System.out.println("visitCaseListElement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRepetetiveStatement(PascalParser.RepetetiveStatementContext ctx) {
        System.out.println("visitRepetetiveStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitWhileStatement(PascalParser.WhileStatementContext ctx) {
        System.out.println("visitWhileStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRepeatStatement(PascalParser.RepeatStatementContext ctx) {
        System.out.println("visitRepeatStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitForStatement(PascalParser.ForStatementContext ctx) {
        System.out.println("visitForStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitForList(PascalParser.ForListContext ctx) {
        System.out.println("visitForList");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitInitialValue(PascalParser.InitialValueContext ctx) {
        System.out.println("visitInitialValue");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFinalValue(PascalParser.FinalValueContext ctx) {
        System.out.println("visitFinalValue");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitWithStatement(PascalParser.WithStatementContext ctx) {
        System.out.println("visitWithStatement");
        return visitChildren(ctx);
    }


    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitRecordVariableList(PascalParser.RecordVariableListContext ctx) {
        System.out.println("visitRecordVariableList");
        return visitChildren(ctx);
    }


    public String getCode() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            result.append(i).append(": ").append(lines.get(i)).append("\n");
        }
        return result.toString();
    }
}