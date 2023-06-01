public class array{
    public static void main(String args[]){
        int A [][]=new int[5] [5];
        int b[] []={{1,2,3}, {2,4,6,},{1,2,3}};
        for(int x[]:b)
        {
            for(int y:x){
                System.out.println(y);
            }
        }


    }
}