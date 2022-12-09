package com.bzl.emp;

import java.util.Scanner;

public class EmpWagesUC8 {
    public static void main(String[] args) {
        CompanyMonthlyWage ob = new CompanyMonthlyWage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter company name : ");
        String comp = sc.nextLine();
        System.out.println("Enter total working days in a month : ");
        int wDay = sc.nextInt();
        System.out.println("Enter working hours per month : ");
        int wHr = sc.nextInt();
        System.out.println("Enter Wage per hour : ");
        int wage = sc.nextInt();
        ob.companyWages(comp, wDay, wHr, wage);
    }
}