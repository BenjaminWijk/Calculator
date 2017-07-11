package calculator.tokenizer;

import java.util.Stack;

/**
 * Created by Benjamin Wijk on 2017-07-11.
 */
public class Operator implements Token {
    String string;

    public Operator(String string){
        this.string = string;
    }

    @Override
    public String getString() {
        return string;
    }

    @Override
    public void handle(Stack<Token> stack) {

    }
}
