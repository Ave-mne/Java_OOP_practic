package Seminar7_HomeWork.Model.Calculator;

import Seminar7_HomeWork.Model.ComplexNumber;

public interface CanCalculate {
    void sum(ComplexNumber number);

    void multiply(ComplexNumber number);

    void subtract(ComplexNumber number);

    void divide(ComplexNumber number);

    ComplexNumber result();
}