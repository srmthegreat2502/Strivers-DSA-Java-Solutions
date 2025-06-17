/*
n = 4
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
 */
package Patterns;
import java.util.Scanner;

public class Pattern12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int space = 2*n-2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            space-=2;
            System.out.println();
        }
    }
}
