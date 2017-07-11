package calculator.tokenizer;

import java.util.Stack;

/**
 * Created by Benjamin Wijk on 2017-07-11.
 */
public interface Token{
    String getString();
    void handle(Stack<Token> stack);
}
