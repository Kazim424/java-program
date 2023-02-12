// Q1 - Input name, roll number and field of interest from user and print in the format below :
// Name: xyz, Roll number: xyz, Field of interest: xyz
// Input : Single line format
// Aman Gupta 4053 Physics
// Output :
// Name: Aman Gupta
// Roll Number: 4053
// Field of interest: Physics

import java.util.*;
public class takingInput_Question1{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // System.out.println("Enter your First-name:");
    // System.out.println("Enter your Last-name:");
    // System.out.println("Enter your Roll_number:");
     // System.out.println("Enter your field of interest:");
     String First_name=sc.next();
     String Last_name=sc.next();
     int roll_number=sc.nextInt();
     String field_of_interest = sc.next();
    System.out.println("Name:" +First_name+ " " +Last_name);
    System.out.println("Roll Number: " +roll_number); 
    System.out.print("Field of interest: " +field_of_interest);
}
}