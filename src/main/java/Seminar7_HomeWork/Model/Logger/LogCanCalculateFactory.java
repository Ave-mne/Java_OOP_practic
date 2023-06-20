package Seminar7_HomeWork.Model.Logger;

import Seminar7_HomeWork.Model.Calculator.CanCalculate;
import Seminar7_HomeWork.Model.ComplexNumber;
import Seminar7_HomeWork.Model.Calculator.ICanCalculateFactory;

public class LogCanCalculateFactory implements ICanCalculateFactory {

    Logger logger;

    public LogCanCalculateFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public CanCalculate create(ComplexNumber arg) {
        return new LogCalculator(arg, logger);
    }
}