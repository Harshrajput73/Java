import java.lang.*;
import java.util.Scanner;

public class calculate_marks {
    public static void main(String args[]){
        byte  m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your c++ marks");
        m1= sc.nextByte();
        System.out.println("enter your math marks");
        m2=sc.nextByte();
        System.out.println("enter your english marks");
        m3=sc.nextByte();
        float avg =(m1+m2+m3)/3;
        System.out.println("overall percentage is"+avg);
        if(avg>40 && avg>33 && avg>33 && avg>33){
            System.out.println("congrats app pass ho gye hai");
        }
        else{
            System.out.println("app phir se padhiya aap fail hai");
        }

    }
}
