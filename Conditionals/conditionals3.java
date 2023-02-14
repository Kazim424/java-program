// Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
// calculate Profit or Loss.
// Explanation : Formula for profit and loss
// Profit = S.P - C.P
// Loss = C.P - S.P
// (S.P is Selling Price and C.P is Cost Price)

// Sample Input:Enter cost price: 4000
// Enter selling price: 9560
// Sample Output:Profit = 5560

import java.util.*;
public class conditionals3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("Enter the cost  price : ");
int cp=sc.nextInt();
System.out.print("Enter the selling  price: ");
int sp=sc.nextInt();
if(cp>sp){
 int loss= cp-sp;
 System.out.println("The loss is : " +loss);
}else if(cp<sp){
int profit=sp-cp;
System.out.println("Profit = " +profit);
}else{
    System.out.print("No Profit No Loss");
}
    }  
}
