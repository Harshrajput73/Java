public class case_statement {
    public static void main(String args[]){
        int age=16;
        switch(age)
        {
            case(16):
            System.out.println("you are not an adult");
            break;
            case(18):
            System.out.println("you are adult");
            break;
            case(65):
            System.out.println("your senior citizen");
            break;
            default:
            System.out.println("please give the valid age");
            break;

        }

    }
}
