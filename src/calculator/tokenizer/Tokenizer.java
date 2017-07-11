package calculator.tokenizer;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Benjamin Wijk on 2017-07-11.
 */
public class Tokenizer {
//    While there are input tokens left
//    Read the next token from input.
//    If the token is a value
//    Push it onto the stack.
//            Otherwise, the token is an operator (operator here includes both operators and functions).
//    It is already known that the operator takes n arguments.
//    If there are fewer than n values on the stack
//            (Error) The user has not input sufficient values in the expression.
//    Else, Pop the top n values from the stack.
//    Evaluate the operator, with the values as arguments.
//    Push the returned results, if any, back onto the stack.
//    If there is only one value in the stack
//    That value is the result of the calculation.
//    Otherwise, there are more values in the stack
//            (Error) The user input has too many values.
//
    public Stack<Token> tokenize(String calculation){
        Stack<Token> stack = new Stack<>();

        try(Scanner in = new Scanner(calculation)){
            while(in.hasNext()){
               Token t = assignTokenType(in.next());
               stack.add(t);
            }

        }catch(Exception e){
            //TODO
        }

        return stack;
    }

    private Token assignTokenType(String s) throws InputMismatchException{
        ValidOperators validOperators = ValidOperators.getInstance();

        if(isValue(s)){
            return new Value(Double.parseDouble(s));
        }
        //Not a value, must be operator
        else{
            Operator o = validOperators.getOperator(s);
            if(o != null){
                return o;
            }
            throw new InputMismatchException("Token is not a valid value or defined operator.");
        }

    }

    boolean isValue(String token){
        try{
            Double.parseDouble(token);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }



}
