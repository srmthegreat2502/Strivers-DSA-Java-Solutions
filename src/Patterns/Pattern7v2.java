package Patterns;

import java.util.Scanner;
/*
n=5
    *
   ***
  *****
 *******
*********
 */
public class Pattern7v2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n =sc.nextInt();
        for(int i = 1; i <=n; i++)
        {
            for(int j =0; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j =0; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
