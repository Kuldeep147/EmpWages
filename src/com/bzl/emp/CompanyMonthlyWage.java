package com.bzl.emp;

import java.util.Random;

public class CompanyMonthlyWage {
    public int wagePerHour;
    public int fullDayHour = 8;
    public int partTimeHour = 8;
    public int dailyWage;public  int workingDays = 20;
    public int monthlyWage;
    public int days;
    public int workHr;
    public int monthTotalWorkDay;
    public int workHrPerMonth;

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
            System.out.println("Total work hour : " + workHr);
            System.out.println("total work days : " + days);
            return monthlyWage;
        }
        public void companyWages(String companyName, int workingDays, int workHrPerMonth, int wagePerHr) {
            this.wagePerHour = wagePerHr;
            monthTotalWorkDay = workingDays;
            this.workHrPerMonth = workHrPerMonth;
            int compMonthWage = monthlyWages();
            System.out.println("Monthly Wages for "+companyName+" is "+compMonthWage);
    }
    }

