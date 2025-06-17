/*
n=4
1
2 3
4 5 6
7 8 9 10
 */
package Patterns;
import java.util.Scanner;

public class Pattern13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern that is needed");
        int n =sc.nextInt();
        int counter = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(counter+" ");
                counter+=1;
            }
            System.out.println();
        }
    }
}
