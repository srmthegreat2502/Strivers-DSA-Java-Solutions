/*
n=3
C
B C
A B C
 */
package Patterns;
import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int alpha;
        for(int i=0;i<n;i++)
        {
            alpha = 'A'+(n-1);
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)alpha+" ");
                alpha-=1;
            }
            System.out.println();
        }
    }
}
