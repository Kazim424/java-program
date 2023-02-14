// Q4 - Write a program to print positive number entered by the user, if user enters a negative
// number, it is skipped

// Sample Input :Enter an integer: -6
// Sample Output :
// The number is negative and skipped


import java.util.*;
public class conditionals4 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter tne number : ");
    int num =sc.nextInt();
    if(num>=0){
        System.out.println("It is positive number");
    }else{
        System.out.println("The number is negative and skipped " );
    }
  }  
}
