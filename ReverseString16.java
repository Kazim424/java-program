// 2.  Program to reverse a String .
import java.util.*;
public class ReverseString16{
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number  : ");
    String name = sc. nextLine();
    int leng=name.length();
    String reverse = " ";
    for(int i= leng-1; i>=0; i--){
        reverse = reverse+name.charAt(i);
       
    }
    System.out.print(reverse);
}
}