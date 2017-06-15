package pascal;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;


public class Main
{
    public static void main(String[] args)
    {
        final String input = "program Prime;\n" +
                "var\n" +
                "  z, y, x : LongInt;\n" +
                "begin\n" +
                "  x := 12445;\n" +
                "  y := 5463;\n" +
                "  if (x * 55 < y) then\n" +
                "  begin\n" +
                "    z := 4363 + y * 543;\n" +
                "  end else\n" +
                "  begin\n" +
                "    z := (2343 + y) * 345;\n" +
                "  end;\n" +
                "  z := z - 445;\n" +
                "end.";

        final CodePointCharStream codePointCharStream = CharStreams.fromString(input);
        final PascalLexer pascalLexer = new PascalLexer(codePointCharStream);
        final CommonTokenStream commonTokenStream = new CommonTokenStream(pascalLexer);
        final PascalParser pascalParser = new PascalParser(commonTokenStream);
        PascalParser.ProgramContext program = pascalParser.program();

        final PascalBaseVisitor<Void> voidPascalBaseVisitor = new PascalBaseVisitor<Void>();
        voidPascalBaseVisitor.visit(program);
        System.out.println(voidPascalBaseVisitor.getCode());
    }
}
