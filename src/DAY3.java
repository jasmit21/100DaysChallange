//prog. to print area and circumference of circle.
import java.util.*;
public class DAY3 {
    public static void main(String[] args){
        float radius;
        double circum;
        double area;
        System.out.println("ENTER RADIUS OF CIRCLE: ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();

        circum = 2*3.14*radius;
        area = 3.14*radius*radius;
        System.out.println("CIRCUMFERENCE IF CIRCLE ="+circum );
        System.out.println("AREA OF CIRCLE = "+area);
    }
}
