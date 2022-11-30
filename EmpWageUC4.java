package com.bzl.emp;
import java.util.Random;

public class EmpWageUC4 {
    public final static int wagePerHour = 20;
    public final static int fullDayHour = 8;
    public final static int partTimeHour = 4;
    public static int attendence;
    public static void main(String[] args) {
        Random r = new Random();
        int dailyWage;
        attendence = r.nextInt(3);
        switch (attendence){
            case 1:
                dailyWage = wagePerHour * fullDayHour;
                break;
            case 2:
                dailyWage = wagePerHour * partTimeHour;
                break;
            default:
                dailyWage = 0;
                break;
        }
        System.out.println("DailyWage : "+dailyWage);
    }
}