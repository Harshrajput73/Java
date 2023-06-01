class empolyee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my id is"+id);
        System.out.println("and my name is "+name);
    }
}

public class class1{
    public static void main(String arg[]){
        System .out.println("this is a custom class");
        empolyee harsh = new empolyee();
        empolyee saurabh=new empolyee();
         harsh.id=12211069;
         harsh.name="rahul";
         harsh.salary=35;
         saurabh.id=12222496;
         saurabh.name="ranjan";
         saurabh.salary=12;
         harsh.printdetails();
         saurabh.printdetails();

 t
        
    }
}