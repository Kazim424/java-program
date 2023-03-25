// Write a program to find given numbermis leap year or not ! 

// import java.util.*;
// public class LeapYear10{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Year : ");
//         int year = sc.nextInt(); 
//         if(year % 4 == 0){
//             if(year % 100 == 0){
//                 if(year % 400 ==0){
//                     System.out.print("It is  a leap year ");   
//                 }else{
//                     System.out.print("It is not a leap year");
//                 }
//                 }else{
//                 System.out.print("It is  a leap year ");
//                 }
//             }else{
//             System.out.print("It is not a leap year");
//         }
//     }
// }

// Another method to find leap year!

import java.util.*;
public class LeapYear10{
    public static void main(String []args){
        String yn ;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = sc.nextInt(); 
        if((year % 400 == 0) || (year % 4 == 0 && year % 100!=0)) {
            System.out.println("It is  a leap year");
        }else{
                System.out.println("It is not a leap year");
            }
            System.out.println("Do you want to continue press Y for Yes and n for no");
            yn=sc.next();
        }while(yn.equals("Y") || yn.equals("y"));
    }
}