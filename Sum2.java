// Write a program to find  sum of number. 

import java.util.*;
public class Sum2{
    public static void main(String[] args){
        String yn;
        do{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the a number:");
        int a = sc.nextInt();
        System.out.print("Enter the b number:");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of the number is:" +sum);
System.out.println("Do you want to continue Press y for Yes and n for No");
yn=sc.next();
}while(yn.equals("y") || (yn.equals("Y")));
}
}