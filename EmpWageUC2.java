package com.bzl.emp;
import java.util.Random;

public class EmpWageUC2 {
    public final static int wagePerHour = 20;
    public final static int fullDayHour = 8;
    public static int attendence;
    public static void main(String[] args) {
        Random r = new Random();
        int dailyWage;
        attendence = r.nextInt(2);
        if (attendence == 1){
            dailyWage = wagePerHour * fullDayHour;
        }else {
            dailyWage = 0;
        }
        System.out.println("DailyWage : "+dailyWage);
    }
}