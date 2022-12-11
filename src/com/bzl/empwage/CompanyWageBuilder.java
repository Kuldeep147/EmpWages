package com.bzl.empwage;

import java.util.Random;
import java.util.Scanner;

public class CompanyWageBuilder {
    private final int wagePerHour;
    private final int fullDayHour = 8;
    private final int partTimeHour = 8;
    private  int dailyWage;
    private  int monthlyWage;
    private  int days;
    private int workHr;
    private final int monthTotalWorkDay;
    private final int workHrPerMonth;
    private final String companyName;

    public int attendence () {
        Random r = new Random();
        int a = r.nextInt(3);
        return a;
    }
    public int dailyEmployeeWage () {
        int wage = wagePerHour * fullDayHour;
        return wage;
    }
    public int partTimeWage () {
        int wage = wagePerHour * partTimeHour;
        return wage;
    }
    public int solvingWage () {
        switch (attendence()) {
            case 0:
                dailyWage = 0;
                days++;
                workHr += 0;
                break;
            case 1:
                dailyWage = dailyEmployeeWage();
                days++;
                workHr += fullDayHour;
                break;
            case 2:
                dailyWage = partTimeWage();
                days++;
                workHr += partTimeHour;
                break;
        }
        return dailyWage;
    }
    public int monthlyWages () {
        for (int i = 1; i <= monthTotalWorkDay; i++) {
            if (days <= monthTotalWorkDay && workHr <= workHrPerMonth) {
                monthlyWage += solvingWage();
            }
        }
        return monthlyWage;
    }
    public CompanyWageBuilder(String companyName, int workingDays, int workHrPerMonth, int wagePerHr) {
        this.wagePerHour = wagePerHr;
        monthTotalWorkDay = workingDays;
        this.workHrPerMonth = workHrPerMonth;
        this.companyName = companyName;
    }
    public String companyWages() {
        int compMonthWage = monthlyWages();
        return "Monthly Wages for " + companyName + " is " + compMonthWage;
    }
}
