/*
n=5
    *
   ***
  *****
 *******
*********
 */
package Patterns;
import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows of the pattern that is needed");
        int n = sc.nextInt();
        String space = null;
        int star = 1;
        int spacecount = n-1;
        for(int i = n; i >=1; i--)
        {
            space = " ".repeat(spacecount);
            System.out.print(space);
            System.out.print("*".repeat(star));
            star+=2;
            spacecount-=1;
            System.out.println();
        }
    }
}
