
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;


public class Main {
    public static void main(String[] args) {
        final String input = "program Prime;\n" +
                "var\n" +
                "  z, y, x : LongInt;\n" +
                "begin\n" +
                "  x := 12445;\n" +
                "  y := 45542;\n" +
                "  if (x * 5435 < y) then\n" +
                "  begin\n" +
                "    z := 436543 + y * 5435;\n" +
                "  end else\n" +
                "  begin\n" +
                "    z := (23423 + y) * 345345;\n" +
                "  end;\n" +
                "  z := z - 45245;\n" +
                "end.";
        final CodePointCharStream codePointCharStream = CharStreams.fromString(input);
        final PascalLexer pascalLexer = new PascalLexer(codePointCharStream);
        final CommonTokenStream commonTokenStream = new CommonTokenStream(pascalLexer);
        final PascalParser pascalParser = new PascalParser(commonTokenStream);
        final PascalBaseVisitor<Void> voidPascalBaseVisitor = new PascalBaseVisitor<Void>();
        voidPascalBaseVisitor.visit(pascalParser.program());
        System.out.println(voidPascalBaseVisitor.getCode());
    }
}
