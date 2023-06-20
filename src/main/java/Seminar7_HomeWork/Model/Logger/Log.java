package Seminar7_HomeWork.Model.Logger;

import java.time.LocalDateTime;

public class Log implements Logger {
    @Override
    public void log(String str) {
        System.out.println(LocalDateTime.now() + " : " +  str);
    }
}