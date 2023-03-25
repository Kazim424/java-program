// Write a program to find  Area and perimeter  of Circle .

import java.util.Scanner;
public class Circle7{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the value of radius : " );
     double radius = sc.nextDouble();
     double pie = 3.14;
     double area = pie*radius*radius;
     double perimeter =2*pie* radius;
     System.out.println("The area of circle is : " + area);
     System.out.println("The perimeter of circle is : " + perimeter);
    }
}