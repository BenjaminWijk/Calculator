package calculator.tokenizer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Benjamin Wijk on 2017-07-11.
 */
public class ValidOperators {
    private static ValidOperators instance;

    Map<String, Operator> validOperators;

    private ValidOperators(){
        validOperators = new HashMap<>();
        createOperators();
    }

    public static ValidOperators getInstance(){
        if(instance == null){
            instance = new ValidOperators();
        }
        return instance;
    }

    public Operator getOperator(String name){
        return validOperators.get(name);
    }

    private void createOperators(){
        String key;
        int noOfArguments;

        key = "+";
        noOfArguments = 2;
        validOperators.put(key,new Operator(key,noOfArguments));

        key = "-";
        noOfArguments = 2;
        validOperators.put(key,new Operator(key,noOfArguments));

        key = "*";
        noOfArguments = 2;
        validOperators.put(key,new Operator(key,noOfArguments));

        key = "/";
        noOfArguments = 2;
        validOperators.put(key,new Operator(key,noOfArguments));

        key = "^";
        noOfArguments = 2;
        validOperators.put(key,new Operator(key,noOfArguments));

    }
}
