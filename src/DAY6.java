import java.util.*;
public class DAY6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int a = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("the factorial="+fact);

    }
}
