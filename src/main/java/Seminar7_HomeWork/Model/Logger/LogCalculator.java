package Seminar7_HomeWork.Model.Logger;

import Seminar7_HomeWork.Model.Calculator.Calculator;
import Seminar7_HomeWork.Model.Calculator.CanCalculate;
import Seminar7_HomeWork.Model.ComplexNumber;

public class LogCalculator implements CanCalculate {

    Calculator calculator;
    Logger logger;

    public LogCalculator(ComplexNumber arg, Logger logger) {
        this.calculator = new Calculator(arg);
        this.logger = logger;
        logger.log("first argument - " + arg + '\n');
    }

    @Override
    public void sum(ComplexNumber number) {
        logger.log("sum " + number + '\n');
        calculator.sum(number);
    }

    @Override
    public void multiply(ComplexNumber number) {
        logger.log("multiply " + number + '\n');
        calculator.multiply(number);
    }

    @Override
    public void subtract(ComplexNumber number) {
        logger.log("subtract " + number + '\n');
        calculator.subtract(number);
    }

    public void divide(ComplexNumber number) {
        logger.log("divide " + number + '\n');
        calculator.divide(number);
    }

    @Override
    public ComplexNumber result() {
        ComplexNumber result = calculator.result();
        logger.log("Result - " + result + '\n');
        return result;
    }
}
