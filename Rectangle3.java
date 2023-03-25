// Write a program to find  Area and perimeter  of Rectangle .

import java.util.*;
public class Rectangle3{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of length :");
        float length =sc.nextFloat();
        System.out.print("Enter the value of breadth :");
        float breadth =sc.nextFloat();
         float area = length*breadth;
         float perimeter = 2* (length+breadth);         
         System.out.println("The area of rectanghle is :" +area);
    System.out.println("The perimeter of rectanghle is :" +perimeter);
    }
}
   

