package calculator.tokenizer;

import java.util.Stack;

/**
 * Created by Benjamin Wijk on 2017-07-11.
 */
public class Value implements Token{
    double value;

    public Value(double value){
        this.value = value;
    }

    @Override
    public String getString() {
        return Double.toString(value);
    }

    @Override
    public void handle(Stack<Token> stack) {
        stack.add(this);
    }
}
