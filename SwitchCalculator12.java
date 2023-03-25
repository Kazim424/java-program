// Write a program to make calculator  program using Switch case .

import java.util.*;
public class SwitchCalculator12{
    public static void main(String []args){
        String yn;
        do{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the vale of a :");
   int a = sc.nextInt();
   System.out.print("Enter the vale of b :");
   int b = sc.nextInt();
   System.out.println("Enter the symbol like + , - , * , / , % : ");
   String symbol = sc.next();
   int result;
   switch(symbol){
    case "+" : result = a + b ; 
    System.out.println("The sum of the number is : " +result);
    break ;
    case "-" : result = a - b ; 
    System.out.println("The subtraction of the number is : " +result);
    break ;
    case "*" : result = a * b ; 
    System.out.println("The multiplication of the number is : " +result);
    break ;
    case "/" : result = a / b ; 
    System.out.println("The division of the number is : " +result);
    break ;
    case "%" : result = a / b ; 
    System.out.println("The remainder of the number is : " +result);
    break ;
    default :  System.out.print("Invalid input of symbol : " );
    break; 
   }
   System.out.println("Do you want to contiue Press y for yes and N for no");
   yn=sc.next();
}while(yn.equals("Y") || yn.equals("y"));
    }
}