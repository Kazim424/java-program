// Write a program to print  Table .

import java.util.*;
public class Table13{
    public static void main (String[] args){
        String yn;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number value those table you want to print :");
        int no = sc.nextInt();
        System.out.println("The table  of " +no+ " is :") ;
        int mul = 1;
        for(int i = 1 ; i<=10; i++ ){ 
         mul =  no*i;
        System.out.println( +no+  " X " +i+ " = " +mul);
        }    
        System.out.println("Do you want to continue Press y for Yes and n for No");
        yn=sc.next();
        }while(yn.equals("y") || (yn.equals("Y")));
    }
}