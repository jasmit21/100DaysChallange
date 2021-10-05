//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class DAY14 {
    public static int SumOfOddNos(int a){
        int add = 0;
        for (int i = 1;i<=a;i++){
            if (i%2!=0){
                 add = add + i;
            }
        }
        return add;
    }
    public static void main(String[] args){
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = SumOfOddNos(n);
        System.out.println("Sum of all odd no's upto "+n+" is "+sum);
    }

}
