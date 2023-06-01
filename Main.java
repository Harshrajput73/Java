import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> vec = new ArrayList<Long>(Arrays.asList(1L, 22L, 123L, 4242L, 45L, 46L));
        int n = vec.size();
    
        for (int i = 0; i < n; i++) {
            String s = Long.toString(vec.get(i));
            while (s.length() > 1) {
                long temp = vec.get(i);
                long sum = 0;
                while (temp != 0) {
                    sum += (temp % 10);
                    temp /= 10;
                }
                vec.set(i, sum);
                s = Long.toString(vec.get(i));
            }
        }
    
        String ans = "";
        for (int i = 0; i < n; i++) {
            if ((vec.get(i) & 1) == 0) {
                ans += Long.toString(vec.get(i));
            } else {
                ans += (char) ('a' + vec.get(i) - 1);
            }
        }
    
        System.out.println(ans);
    }
}