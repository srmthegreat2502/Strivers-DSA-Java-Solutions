/*
n=3
*         *
* *     * *
* * * * * *
* *     * *
*         *
 */
package Patterns;
import java.util.Scanner;

public class Pattern20v2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int counter = 1;
        int spacecount = 2*n-2;
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=counter;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=spacecount;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=counter;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i<n)
            {
                counter+=1;
                spacecount-=2;
            }
            else
            {
                counter-=1;
                spacecount+=2;
            }
        }
    }
}
