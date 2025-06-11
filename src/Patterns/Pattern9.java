/*
n = 5
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 */
package Patterns;
import java.util.Scanner;

public class Pattern9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int spacecount = n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<spacecount;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j<spacecount;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
            spacecount-=1;
        }
        spacecount=1;
        for(int i = n-1;i>0;i--)
        {
            for(int j = 0; j<spacecount; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j = 0 ;j<spacecount; j++)
            {
                System.out.print(" ");
            }
            spacecount+=1;
            System.out.println();
        }
        /* The  pattern can also be solved by using the .repeat() function that is used in Patterns.Pattern7. However, it is not available in the older versions of Java */
    }
}
