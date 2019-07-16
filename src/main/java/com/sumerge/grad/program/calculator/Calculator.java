package com.sumerge.grad.program.calculator;

import com.sumerge.grad.program.operation.ArithmeticOperation;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Calculator {

    private ArithmeticOperation operation;

    public Double add(Double n1, Double n2) {
    //        throw new NotImplementedException();
        operation = new CalculateAddition();
        return operation.performOperation(n1,n2);

    }

    public Double subtract(Double n1, Double n2) {
//        throw new NotImplementedException();
        operation = new CalculateSubtraction();
        return operation.performOperation(n1,n2);
    }

    public Double multiply(Double n1, Double n2) {
//        throw new NotImplementedException();
        operation = new CalculateMultiplication();
        return operation.performOperation(n1,n2);
    }

    public Double divide(Double n1, Double n2) {
//        throw new NotImplementedException();
        operation = new CalculateDivision();
        return operation.performOperation(n1,n2);
    }


}
