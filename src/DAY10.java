import java.util.*;

public class DAY10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();
        for(int i = 1;i<11;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}