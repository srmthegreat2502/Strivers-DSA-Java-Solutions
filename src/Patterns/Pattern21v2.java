/*
n=3
***
* *
***
 */
package Patterns;
import java.util.Scanner;

public class Pattern21v2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                System.out.print("*");
                for(int j=1;j<=n-2;j++);
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
