import java.lang.*;
import java.util.*;
public class area_trangle {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float length;
        float breadth;
        float area;
        System.out.println("enter the value of length");
        length=sc.nextFloat();
        System.out.println("enter the value of breadth");
        breadth=sc.nextFloat();
        area=(length*breadth)/2;
        System.out.println("area of trangle is " +area);
    }
    
}
