// Write a program to swap the number with aother variable and without another variable .

// without another variable 

// import java.util.Scanner;
// public class Swap11{
//     public static void main (String [] args){
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the value of a :");
// int a = sc.nextInt();
// System.out.print("Enter the value of b :");
// int b = sc.nextInt();
// System.out.println("The value of a before swap : " +a);
// System.out.println("The value of b before swap : " +b);
// a = a+b;
// b = a-b;
// a = a-b;
// System.out.println("The value of a after swap is :" +a );
// System.out.println("The value of b after swap is :" +b );
// }
// }

//  With another variable 

import java.util.Scanner;
public class Swap11{
    public static void main (String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a :");
int a = sc.nextInt();
System.out.print("Enter the value of b :");
int b = sc.nextInt();
int temp;
System.out.println("The value of a before swap : " +a);
System.out.println("The value of b before swap : " +b);
temp = a;
a = b;
b = temp;
System.out.println("The value of a after swap is :" +a );
System.out.println("The value of b after swap is :" +b );
}
}