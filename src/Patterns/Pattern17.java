/*
n=4
   A
  ABA
 ABCBA
ABCDCBA
 */
package Patterns;
import java.util.Scanner;

public class Pattern17 {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows of the pattern that is needed");
            int n = sc.nextInt();
            int spacecount = n-1;
            char alpha;
            for(int i=0;i<n;i++)
            {
                alpha='A';
                for(int j=0;j<spacecount;j++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print(alpha+"");
                    alpha+=1;
                }
                alpha-=2;
                for(int j=i-1;j>=0;j--)
                {
                    System.out.print(alpha+"");
                    alpha-=1;
                }
                System.out.println();
                spacecount-=1;
            }

        }
}
