/*
n=3
***
* *
***
*/
package Patterns;
import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                System.out.println("*".repeat(n));
            }
            else
            {
                System.out.println("*"+" ".repeat(n-2)+"*");
            }
        }
    }
}
