/*
n=3
* * * * * *
* *     * *
*         *
*         *
* *     * *
* * * * * *
*/
package Patterns;
import java.util.Scanner;

public class Pattern19v2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int spacecount = 0;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=spacecount;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            spacecount+=2;
            System.out.println();
        }
        spacecount-=2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=spacecount;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            spacecount-=2;
        }
    }
}
