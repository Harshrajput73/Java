import java.util.*;
public class goldpayement{
    public static void main(String[] args) {
        int days=0;
        System.out.print("Enter no of days ");
        Scanner sc= new Scanner(System.in);
        days=sc.nextInt() ;  
    
    ArrayList<Integer> cuts= new ArrayList<>();
    int sum=0;
   
    while(days>0){
    int x=sum+1;
    if(days-x>=0){
    sum+=x;
    cuts.add(x);
    days-=x;
    }else{
    cuts.add(days);
    break;
    }
    }
    System.out.println("Total cuts= "+cuts.size());
    System.out.print("[ ");
    for(int cut:cuts){
    System.out.print(cut+" ");
    }
    System.out.print("]");
   
   }
}

