import javax.sound.sampled.SourceDataLine;

class empolye{
    int salary;
    String name;
    public  int getSalary(){
        return salary;

    }
    public String getName(){
        return name;

    }
    public void setName(String n){
        name = n;
    }

}
public class employee{
    public static void main (String args[]){
        empolye harsh = new empolye();
        harsh.setName("code with harsh");
        harsh.salary=233;
        System.out.println(harsh.getName());
        System.out.println(harsh.salary);
    }
}








