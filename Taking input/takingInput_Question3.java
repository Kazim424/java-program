// Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
// 100), write a program to calculate his total marks and percentage marks.
// Input :
// 78
// 89
// 95
// Output : Total marks: 262
// Percentage marks: 87%

import java.util.*;
public class takingInput_Question3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int subject1=sc.nextInt();
        int subject2=sc.nextInt();
        int subject3=sc.nextInt();
        int total_marks=subject1+subject2+subject3;
        int percentage= total_marks/3;
        System.out.println("Total marks:" +total_marks);
        System.out.println("percentage marks:" +percentage+"%");
}
}