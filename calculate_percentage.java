import java.lang.*;
import java.util.Scanner;

public class calculate_percentage {
    public static void main(String[] agrs) {

        Scanner s = new Scanner(System.in);
        float math;
        float science;
        float arts;
        float java;
        float web;
        System.out.println("math");
        math = s.nextFloat();
        System.out.println("science");
        science = s.nextFloat();
        System.out.println("arts");
        arts = s.nextFloat();
        System.out.println("java");
        java = s.nextFloat();
        System.out.println("web");
        web = s.nextFloat();
        float total = (math + science + arts + java + web);
        float per = (total / 500) * 100;
        System.out.println("total marks " + total);
        System.out.println("percentage " + per);

    }
}
