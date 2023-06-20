package Seminar7_HomeWork.Model.Calculator;

import Seminar7_HomeWork.Model.ComplexNumber;

public interface ICanCalculateFactory {
    CanCalculate create(ComplexNumber arg);
}