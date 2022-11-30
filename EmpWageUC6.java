package com.bzl.emp;
import java.util.Random;

public class EmpWageUC6 {
    public final static int wagePerHour = 20;
    public final static int fullDayHour = 8;
    public final static int partTimeHour = 8;
    public static int attendence;

    public static void main(String[] args) {
        Random r = new Random();
        int dailyWage;
        int monthlyWage = 0;
        int days = 0;
        int hours = 0;
        for (int i = 0; i < 20; i++) {
            if (hours <= 100 && days <= 20) {
                attendence = r.nextInt(3);
                days++;
                switch (attendence) {
                    case 1:
                        dailyWage = wagePerHour * fullDayHour;
                        hours += fullDayHour;
                        break;
                    case 2:
                        dailyWage = wagePerHour * partTimeHour;
                        hours += partTimeHour;
                        break;
                    default:
                        dailyWage = 0;
                        break;
                }
                monthlyWage += dailyWage;
            }
        }
        System.out.println("hours : "+hours);
        System.out.println("days : "+days);
        System.out.println("MonthlyWage : "+monthlyWage);
    }
}