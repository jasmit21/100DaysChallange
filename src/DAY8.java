import java.util.Scanner;

public class DAY8 {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
    int n = sc.nextInt();
    int a = 0, b = 1, c;
        System.out.println("The fibonacci series is :");
        for (int i = 1; i <= n; i++) {
        System.out.print(+a + ",");
        c = a + b;
        a = b;
        b = c;
}
  }}
