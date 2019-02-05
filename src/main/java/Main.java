import org.antlr.v4.runtime.*;
import java.util.*;
import java.util.stream.*;
import static java.lang.System.out;

public class Main {
    public static class MyToken {
        public String tokenType;
        public String lexeme;
        public MyToken(String tokenType, String lexeme) {
            this.tokenType = tokenType;
            this.lexeme = lexeme;
        }
    }

    public static Stream<MyToken> analyze(String filename) {
        // Replace this with your code
        return Stream.empty();
    }
    public static void main(String[] args) {
        String filename = args[0];
        analyze(filename)
            .forEach(x -> {
                out.println(x);
            });

    }
}
