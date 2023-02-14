// Input: 5 10
// Output: 10 5
// Q2 - Swap two numbers without the use of third variable.
import java.util.*;
public class operators2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        // System.out.println("THe value of x before swap :" +x);
        // System.out.println("THe value of y before swap :" +y);

        x= x+y;
        y=x-y;
        x=x-y;
        // System.out.println("THe value of x after swap :" +x);
        // System.out.print("THe value of y after swap :" +y);
        System.out.println(x);
        System.out.println(y);
    }
}
