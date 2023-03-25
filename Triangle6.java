// Write a program to find  Area and perimeter  of triangle .

import java.util.*;
public class Triangle6{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the base of triangle :");
        int base =sc.nextInt();
        System.out.print("Enter the height  of triangle :");
         int height = sc.nextInt();
         System.out.print("Enter the hypotaneous  of triangle :");
         int hypotaneous = sc.nextInt();
         int area =  (base * height)/2;
         int perimeter = base + height + hypotaneous;         
         System.out.println("The area of triangle is :" + area);
         System.out.println("The perimeter of triangle is :" + perimeter);
    }
}