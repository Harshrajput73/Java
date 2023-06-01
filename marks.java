public class marks{
    public static void main(String arg[]){
        float[] marks={45.1f,56.1f,86.2f,89.2f,92.4f};
        float sum=0;
        for(float element: marks){
            sum=sum+element;
            System.out.println("the value of sum is"+sum);
        }
        System.out.println(sum);

    }
}