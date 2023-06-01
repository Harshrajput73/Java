
    public class palindromeNames{
        public static void main(String[] args) {
        
            String[] names = {"harsh", "saurabh", "satish", "saroj", "rahul","tob",  "lal","bob" ,"ava"};
    
                      String[] palindromeNames = new String[names.length]; 
            int count = 0;
            int index = 0;
            for (int i = 0; i < names.length; i++) {
        
                boolean isPalindrome = true;
                int length = names[i].length();
                for (int j = 0; j < length / 2; j++) {
                    if (names[i].charAt(j) != names[i].charAt(length - j - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    palindromeNames[index++] = names[i];
                    count++;
                }
            }
            System.out.println("Number of students with palindrome names: " + count);
            System.out.print("Names of students with palindrome names: ");
            for (int i = 0; i < count; i++) {
                System.out.print(palindromeNames[i] + " ");
            }
            System.out.println();
}
    }
