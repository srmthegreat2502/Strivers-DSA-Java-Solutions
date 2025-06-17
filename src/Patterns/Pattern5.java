/*
n = 5
* * * * *
* * * *
* * *
* *
*
 */
package Patterns;
import java.util.Scanner;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number of rows of the pattern");
        int n = sc.nextInt();
        for(int i = n; i>=0; i--)
        {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
