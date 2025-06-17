/*
n=3
A B C
A B
A
 */
package Patterns;
import java.util.Scanner;

public class Pattern15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern that is needed");
        int n = sc.nextInt();
        char alpha;
        for(int i=0;i<=n;i++)
        {
            alpha='A';
            for(int j=n-i-1;j>=0;j--)
            {
                System.out.print(alpha+" ");
                alpha+=1;
            }
            System.out.println();
        }
    }
}
