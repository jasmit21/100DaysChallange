//prog to create array by taking input from user and to display elements of the array
import java.util.*;
public class DAY16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array: ");
        int size = sc.nextInt();
        int[]arr = new int[size];
        System.out.println("----------INPUT-----------");
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter  element no  "+(i+1));
            arr[i] = sc.nextInt();
        }

        for (int i =0;i<size;i++){
            System.out.println("Element No.  "+ (i+1) +" ="+arr[i]);
        }
    }
}
