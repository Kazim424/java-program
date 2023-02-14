// Q5 - Find the total number of bits needed to be flipped to convert x to y.
// Input: 65 80
// Output: 2

import java.util.*;

public class operators5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = x ^ y;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.print(count);
    }
}