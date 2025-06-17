/*
n=3
A
A B
A B C
 */
package Patterns;
import java.util.Scanner;

public class Pattern14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int alpha;
        for(int i=0;i<n;i++)
        {
            alpha=65;
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)alpha+" ");
                alpha+=1;
            }
            System.out.println();
        }
    }
}
/*
Can also be solved using
char alpha='A';
which can be incremented to 'B' using alpha+=1, and so on.
 */