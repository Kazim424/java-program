// Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
// is taken with 5 and then multiply the resultant value by 5. Display the final result.
// Input: 2345
// Output: 20

import java.util.*;
public class operators1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of x: " );
        int x=sc.nextInt();
        System.out.println(((x+8)/3)%5*5);
    }
}