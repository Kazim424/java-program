// Q-5: Write a java program to swap two numbers with the help of a third variable.
// Sample input: 2,3
//  Sample output: 3,2
public class variableQuestion5 {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        System.out.println("The first number before swap : " +a);
        System.out.println("The second number before swap : " +b);
            int temp;
            temp=a;
            a=b;
            b=temp;
        System.out.println("The first number after swap : " +a);
        System.out.println("The second number after swap : " +b);
        
    }
}
