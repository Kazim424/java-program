// 2.  Program to reverse a number .

import java.util.*;
public class ReverseNumber15{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number  : ");
    long no = sc.nextLong();
    long rem;
    long rev=0;
    while(no>0){
    rem = no % 10;
    rev = rev * 10 + rem;
    no = no / 10;
    }
    System.out.println("The reversr of number is :" +rev);
}
}