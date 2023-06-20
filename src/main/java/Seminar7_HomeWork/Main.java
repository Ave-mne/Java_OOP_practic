package Seminar7_HomeWork;

import Seminar7_HomeWork.Model.Logger.FileLogger;
import Seminar7_HomeWork.Model.Logger.Log;
import Seminar7_HomeWork.Model.Logger.LogCanCalculateFactory;
import Seminar7_HomeWork.Model.Logger.Logger;
import Seminar7_HomeWork.View.ConsoleView;

public class Main {
    public static void main(String[] args) {
        LogCanCalculateFactory logCanCalculateFactory = new LogCanCalculateFactory(new Log());
        ConsoleView consoleView = new ConsoleView(logCanCalculateFactory);
        consoleView.run();
    }
}