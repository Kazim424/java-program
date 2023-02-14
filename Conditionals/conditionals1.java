// Q1 - Write a program which takes the values of length and breadth from user and check if it is a square or
// not.
//  Sample Input:Enter length:
// 5
// Enter breadth:
// 4
// Sample Output:It is a rectangle


import java.util.*;
public class conditionals1 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the length: ");
    int length=sc.nextInt();
    System.out.print("Enter the breadth: ");
    int breadth=sc.nextInt();
    if(length==breadth){
        System.out.println("It is a square");
    }
    else{
        System.out.println("It is a rectangle");
    }
 }   
}