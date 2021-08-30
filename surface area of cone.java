package com.company;
import java.lang.Math.*;
import java.util.Scanner;

public class tutorial_7 {
    public static void main(String[] args) {
//        double radius = 12;
//        double height = 12;
//        double A = Math.PI*radius*(radius+(height*height+radius*radius));
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        double radius = sc.nextDouble();
        System.out.println("enter the height");
        double height = sc.nextDouble();
        double A = Math.PI*radius*(radius+(height*height+radius*radius));
        System.out.println(A);
    }
}
//pir[r+(h*h+r*r)]