// Write a program to find  the largest of two and three number .

// import java.util.Scanner;
// public class Largest5{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the value of a :");
//         int a = sc.nextInt();
//         System.out.println("Enter the value of b :");
//         int b = sc.nextInt();
//         if(a>b){
//             System.out.println("Value of a is Greater");
//         }
//         else if(a==b){
//             System.out.println("Value of a is equal to b");
//         }
//         else{
//             System.out.println("Value of  b is Greater");
//         }
//     }
// }

//Largest of three number

import java.util.Scanner;
public class Largest5{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Value of a is Greater " +a);
        }
        else if(b>a && b>c){
            System.out.println("Value of b is greater ."  +b );
        }
        else{
            System.out.println("Value of  c is Greater : " + c);
        }
    }
}
