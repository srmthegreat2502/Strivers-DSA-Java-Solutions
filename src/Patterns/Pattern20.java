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

public class Pattern20 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int counter = 1;
        int spacecount = 2*n-2;
        for(int i=1;i<=2*n-1;i++)
        {
            System.out.print("* ".repeat(counter));
            System.out.print("  ".repeat(spacecount));
            System.out.println("* ".repeat(counter));
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
