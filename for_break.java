import java.lang.*;
public class for_break {
    public static void main(String arg[]){
        for (int i=0; i<=5; i++){
            System.out.println(i);
            System.out.println("java is great");
            if(i==51){
                System.out.println("ending the loop") ;
                break;
            }
        }
        System.out.println("ending the loop here");
    }
    
}
