// Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
// and division.
// Sample Input :
// Enter an operator (+, -, *, /): -
// Enter two numbers:
// 6
// 8
// Sample output :6 - 8 = -2

import java.util.*;

public class conditionals5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an operator: (+, -, *, or /)");
        char symbol = sc.next().charAt(0);
        System.out.print("Enter first number : ");
        Double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        Double num2 = sc.nextDouble();
        

        Double ans;
        switch (symbol) {
            case '+':
                ans = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + ans);
                break;
            default:
                System.out.println("Error! The operator is not correct");
                break;
        }
    }
}
