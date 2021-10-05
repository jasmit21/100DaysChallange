import java.util.*;
public class DAY13 {
    public static float average(int a , int b, int c){

        return  (float)(a+b+c)/3;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 no's:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        float average = average(n1,n2,n3);
        System.out.println("The average of 3 numbers is" +average);
    }
}
