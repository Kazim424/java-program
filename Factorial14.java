// 1. Write a program to print factorial of a number .

// import java.util.*;
// public class Factorial14{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number those factorial you want to print: ");
//     int no = sc.nextInt();
//     int fact = 1;
//     // for(int i = 1; i<=no; i++){
//     //     fact= fact*i;  
//     // }

//     for(int i = no; i>=1; i--){
//         fact= fact*i;   
//     }
//     System.out.println("The Factorial of " +no+ " is :" +fact );

//     }
// }

// 2.  Program to Find the Factorial of the number using Recursion in java .

// import java.util.*;
// public class Factorial14
//{
//     static int fact = 1 ; 
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number those factorial you want to print: ");
//         int no = sc.nextInt();
//         Factorial14 f = new Factorial14();
//         f.calcFact(no);
//         System.out.println("Factorial of " +no+ " is : " +fact );
//       }
//        void calcFact(int no)
//     {
//         if(no >= 1)
//         {
//             fact = fact* no;
//             calcFact(no-1);
//          }
        
//      }
// }


// 3. Simple previous Program to Find the Factorial of the number using Recursion in java .

import java.util.*;
public class Factorial14{
  //  static int fact = 1 ; 
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number those factorial you want to print: ");
            int no = sc.nextInt();
            int fact;
            Factorial14 f = new Factorial14();
            fact = f.calcFact(no);
            System.out.println("Factorial of " +no+ " is : " +fact );
    }
     int calcFact(int no)
     {
        if(no >= 1)
        {
            return (no*calcFact(no-1));
        } 
        return 1;   
     }
}