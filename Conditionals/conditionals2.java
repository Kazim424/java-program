// Q2 - Write a program to print absolute value of a number entered by the user.
// Sample Input:-1
// Sample Output:1

import java.util.*;

public class conditionals2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        int num = sc.nextInt();
        if (num < 0) {
            num = num * -1;
        }
        System.out.print("The absolute value is : " + num);
    }
}
