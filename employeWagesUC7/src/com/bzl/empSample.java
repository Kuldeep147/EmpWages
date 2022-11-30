package com.bzl;

import java.util.Random;

public class empSample {
    public int wagePerHour = 20;
    public int fullDayHour = 8;
    public int partTimeHour = 8;
    public int dailyWage;
    public int monthlyWage;
    public int days;
    public int workHr;
    public final int workingDays = 20;

    public int attendence(){
        Random r = new Random();
        int a = r.nextInt(3);
        return a;
    }
    public int dailyEmployeeWage(){
        int wage = wagePerHour * fullDayHour;
        return wage;
    }
    public int partTimeWage(){
        int wage = wagePerHour * partTimeHour;
        return wage;
    }
    public int solvingWage(){
        switch (attendence()) {
            case 0 :
                dailyWage = 0;
                days++;
                workHr += 0;
                break;
            case 1 :
                dailyWage = dailyEmployeeWage();
                days++;
                workHr += fullDayHour;
                break;
            case 2 :
                dailyWage = partTimeWage();
                days++;
                workHr += partTimeHour;
                break;
        }
        return dailyWage;
    }
    public int monthlyWages(){
        for(int i = 1; i <= workingDays; i++){
            if(days <= 20 && workHr <= 100){
                monthlyWage += solvingWage();
            }
        }
        System.out.println("Total work hour : "+workHr);
        System.out.println("total work days : "+days);
        return monthlyWage;
    }
}
