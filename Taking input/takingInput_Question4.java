// Q4 - Given two numbers, return their sum in the following format:
// Int t representing number of test cases
// T lines of Two integers representing the numbers to be added
// Input :
// 3
// 4 5
// 18 20
// 49 27
// Output :
// 9
// 38
// 76
import java.util.*;
public class takingInput_Question4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int term =sc.nextInt();
    for(int i=1; i<=term;i++){
    int x= sc.nextInt();
    int y= sc.nextInt();
    System.out.println(x+y);
    }
}
}