/*
Example:
Input: ‘N’ = 3

Output:
1
1 2
1 2 3
 */
package Patterns;
import java.util.Scanner;

public class Pattern3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
