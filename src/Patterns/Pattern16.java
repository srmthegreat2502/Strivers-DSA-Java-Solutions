/*
n=3
A
B B
C C C
 */
package Patterns;
import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern that is needed");
        int n = sc.nextInt();
        char alpha = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(alpha+" ");
            }
            alpha+=1;
            System.out.println();
        }
    }
}
