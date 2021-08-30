package com.company;
import java.util.Scanner;
public class tutorial_9 {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of sub1");
        sub1 = sc.nextInt();
        System.out.println("enter the marks of sub2");
        sub2 = sc.nextInt();
        System.out.println("enter the marks of sub3");
        sub3 = sc.nextInt();
        System.out.println("enter the marks of sub4");
        sub4 = sc.nextInt();
        System.out.println("enter the marks of sub5");
        sub5 = sc.nextInt();
        int marks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("your marks is");
        System.out.println(marks);
        float total = marks*100/500;
        System.out.println("your percentage is given");
        System.out.println(total);


    }
}
