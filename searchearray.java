import java.util.*;
public class searchearray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A[]={3,4,5,6,7,8,9,10,11,12,13,14,15};
        int key;
        System.out.println("enter a key");
        key=sc.nextInt();
        for(int i=0; i<A.length; i++){
            if (key ==A[i]){
                System.out.println("element found at:" +i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
    
}
