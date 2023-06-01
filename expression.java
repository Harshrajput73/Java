import java.util.Scanner;
public class expression {
    public static void main (String arg[]){
        float base,height,area;
        System.out.println("enter the value of height  ");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        area=base*height/2;
        System.out.println("area of triangle is" +area);

    }
    
}
