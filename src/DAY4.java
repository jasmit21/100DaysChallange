//prog to swap two numbers given by user
import java.util.*;
public class DAY4 {
    public static void main(String[] args){
        int n1,n2,temp; //declaring var
        Scanner ch = new Scanner(System.in); //taking input
        System.out.println("Enter 1st number:");
        n1 = ch.nextInt();
        System.out.println("Enter 2nd number:" );
        n2 = ch.nextInt();
        //swapping

        temp = n1;
        n1 = n2;
        n2 = temp;
        //printing output
        System.out.println("Swapper numbers are:-");
        System.out.println("1st num:-"+n1);
        System.out.println("2nd num:-"+n2);

    }
}
