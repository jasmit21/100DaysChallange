//patterns
import java.util.*;
public class DAY7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int b = sc.nextInt();
        int r, temp = b, sum = 0;
        while (temp > 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp /= 10;
        }
        if (sum == b)
            System.out.println("Entered number is Armstrong number");
        else
            System.out.println("Entered number is not Armstrong number");
    }
    }

