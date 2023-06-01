public class Strings1 {
    public static void main(String args[]){
    String firstname="harsh";
    String lastname="singh";
    String fullname=firstname + "@" +lastname;

    System.out.println(fullname.length() );
    for(int i=0; i<fullname.length();i++){
        System.out.println(fullname.charAt(i));
    }

    }
}
