package behavioral.interpreter;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }

}