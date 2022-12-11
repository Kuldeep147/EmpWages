package com.bzl.empwage;

import java.util.Scanner;

public class EmpWageUC9 {
    public static void main(String[] args) {
        CompanyWageBuilder dMart = new CompanyWageBuilder("DMart",20,100,20);
        CompanyWageBuilder reliance = new CompanyWageBuilder("Reliance",25,120,30);
        String dm = dMart.companyWages();
        String re = reliance.companyWages();
        System.out.println(dm);
        System.out.println(re);
    }
}