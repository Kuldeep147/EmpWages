package com.bzl.emp;
import java.util.Random;

public class EmpWageUC1 {
    public static int attendence;
    public static void main(String[] args) {
        Random r = new Random();
        attendence = r.nextInt(3);
        System.out.println(attendence);
    }
}