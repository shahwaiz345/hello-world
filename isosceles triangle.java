package com.company;
import java.lang.Math;
import java.util.Scanner;

public class tutorial_10 {
    public static void main(String[] args) {
   int B,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of B");
         B= sc.nextInt();
        System.out.println("enter the value of a");
        a= sc.nextInt();
        System.out.println("enter the value of b");
        b= sc.nextInt();
   double area = B/4*Math.sqrt((4*a*a)-(b*b));
        System.out.println(area);
    }
}
//b/4sqrt4*a*a-b*b