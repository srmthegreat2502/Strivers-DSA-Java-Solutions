/*
n=4
1
0 1
1 0 1
0 1 0 1
 */
package Patterns;
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the pattern that is needed");
        int n = sc.nextInt();
        int first;
        int second;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                first=1;
                second = 0;
            }
            else
            {
                first=0;
                second=1;
            }
            for(int j=0;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print(first);
                }
                else
                {
                    System.out.print(second);
                }

            }
            System.out.println();
        }
    }
}
