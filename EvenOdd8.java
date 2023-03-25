// Write a program to check for even odd number .

import java.util.*;
public class EvenOdd8{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number a : ");
    int a = sc.nextInt();
   if(a % 2 == 0){
    System.out.println("It is a Even number ");
   }
   else{
    System.out.println("It is a Odd number");
   }
}
}
