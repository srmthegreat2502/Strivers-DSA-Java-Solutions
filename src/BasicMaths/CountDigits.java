/*
Given a number n, find out and return the number of digits in that number.
Input:
n=123
Output:
The number of digits is 3.
 */
package BasicMaths;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out the number of digits in that number    ");
        int n = sc.nextInt();
        int length = 0;
        int number = n;
        while(number>0)
        {
            number=number/10;
            length+=1;
        }
        System.out.println("The number of digits is "+length);
        System.out.println("The number is "+n);
    }
}
