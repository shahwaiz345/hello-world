package com.company;
//import java.util.Scanner;
import java.lang.Math.*;
import java.util.Scanner;

public class tutorial_6 {
    public static void main(String[] args) {
//        double radius = 24;
//        double height = 22;
//        double A = 2*Math.PI*radius*(radius+height);
//        System.out.println(A);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius");
        double radius = sc.nextDouble();
        System.out.println("enter the value of radius");
        double height = sc.nextDouble();
        double A = 2*Math.PI*radius*(radius+height);
        System.out.println(A);

    }
}
// A = 2*PI*r(r+h)
