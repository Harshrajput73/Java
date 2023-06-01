public class lowercase {
    public static void main(String arg[]){
        //problem1

       // String name= "Harsh Singh";
        //name = name.toLowerCase();
        //System.out.println(name);
        //problem 2

       // String text ="to Lower case";
        //ext =text.replace( "","_");
       // System.out.println(text);
        //problem3
        String letter="Dear<|name|>,thanks a lot!";
        letter = letter.replace("|<name>|","sachin");

        System.out.println("letter");



    }
}
