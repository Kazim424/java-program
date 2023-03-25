// Write a program to find  Area and perimeter  of Square .

import java.util.*;
public class Square4{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the side of square :");
        int side =sc.nextInt();
         int area = side*side;
         int perimeter = 4*side;         
         System.out.println("The area of square is :" +area);
         System.out.println("The perimeter of square is :" +perimeter);
    }
}