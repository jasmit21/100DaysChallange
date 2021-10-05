//prog to print greater number
import java.util.*;
public class DAY12 {
    public static void main(String[] args) {
        int num1, num2, num3, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3) {
            temp = num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            temp = num2;
        }
        else {
            temp = num3;
        }
        System.out.println("The largest number is "+temp);

    }
}