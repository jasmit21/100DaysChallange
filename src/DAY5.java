//prag to make menu driven calculator

import java.util.*;
public class DAY5 {
    public static void main(String[] args) {
        float n1, n2, sum, diff, prod, div;
        int ch ,op=0;



        Scanner in = new Scanner(System.in);

        System.out.println("ENTER TWO NUMBERS: ");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        do {

            System.out.println("ENTER YOUR CHOICE:\n 1.ADDITION\n 2.SUBTRACTION\n 3.MULTIPLY\n 4.DIVIDE");

            ch = in.nextInt();
        switch (ch) {
            case 1 -> {
                sum = n1 + n2;
                System.out.println("ADDITION = " + sum);
                System.out.println("Do u want to continue? \nif yes type 1");
                op = in.nextInt();
            }
            case 2 -> {
                diff = n1 - n2;
                System.out.println("SUBTRACTION = " + diff);
                System.out.println("Do u want to continue? \nif yes type 1");
                op = in.nextInt();
            }
            case 3 -> {
                prod = n1 * n2;
                System.out.println("PRODUCT = " + prod);
                System.out.println("Do u want to continue? \nif yes type 1");
                op = in.nextInt();
            }
            case 4 -> {
                div = n1 / n2;
                System.out.println("Division = " + div);
                System.out.println("Do u want to continue? \nif yes type 1");
                op = in.nextInt();
            }
            default -> System.out.println("INVALID CHOICE!!!");
        }
        }while (op==1);

    }



}
