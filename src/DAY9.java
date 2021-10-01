/*Given an integer,n, perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird*/

import java.util.*;
public class DAY9
{
    public static void main(String[] args)
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        n = sc.nextInt();
        if(n>=1 && n<=100)
        {
            if(n%2!=0)
            {
                System.out.println("Weird");
            }
            if(n%2==0 && n>=2 && n<=5)
            {
                System.out.println("Not Weird");
            }
            if(n%2==0 && n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            if(n%2==0 && n>20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}

