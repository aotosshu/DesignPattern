package interpreter;

import java.util.Optional;

public class InterpreterClient {

    public InterpreterContext ic;

    public InterpreterClient(InterpreterContext i) {
        this.ic = i;
    }

    public String interpret(String str) {
        int c = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        Expression expression = null;

        if (str.contains("Hexadecimal")) {
            expression = new IntToHexExpression(c);
        } else if (str.contains("Binary")) {
            expression = new IntToBinaryExpression(c);
        }

        return Optional.ofNullable(expression).map(e -> e.interpret(ic)).orElse(str);
    }
}
