/*
n=3
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
 */
package Patterns;
import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the pattern");
        int n = sc.nextInt();
        int top,bottom,right,left,min;
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                top = i;
                left = j;
                right = (2*n-1)-1-j;
                bottom = (2*n-1)-1-i;
                min = Math.min(Math.min(top,bottom), Math.min(right, left));
                System.out.print(n-min+" ");
            }
            System.out.println();
        }
    }
}
