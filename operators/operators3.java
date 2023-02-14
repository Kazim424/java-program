// Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
// Input: 132
// Output: 6


import java.util.*;
public class operators3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of num with three digit value : " );
    int num =sc.nextInt();
    int sum=0;
    while(num>0){
        sum =sum+num%10;
        num=num/10;
    }
    System.out.println(sum);
  }  
}
