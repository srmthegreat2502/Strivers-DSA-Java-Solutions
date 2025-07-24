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

public class Pattern19 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int spacecount = 0;
        for(int i=n;i>=1;i--)
        {
            System.out.print("* ".repeat(i));
            System.out.print("  ".repeat(spacecount));
            System.out.println("* ".repeat(i));
            spacecount+=2;
        }
        spacecount-=2;
        for(int i=1;i<=n;i++)
        {
            System.out.print("* ".repeat(i));
            System.out.print("  ".repeat(spacecount));
            System.out.println("* ".repeat(i));
            spacecount-=2;
        }

    }
}
