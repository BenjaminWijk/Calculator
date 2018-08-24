package calculator.tokenizer;

import java.util.Stack;

/**
 * Created by Benjamin Wijk on 2017-07-11.
 */
public class Operator implements Token {
    String string;
    int noOfArguments;

    public Operator(String string, int noOfArguments){
        this.string = string;
        this.noOfArguments = noOfArguments;
    }

    @Override
    public String getString() {
        return string;
    }

    @Override
    public void handle(Stack<Token> stack) {

    }
}
