import java.util.*;

    public class SalaryPairs {
        
        
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                
                System.out.print("Enter the size of the salary array: ");
                int n = input.nextInt();
                int[] salary = new int[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter the salary for employee " + (i+1) + ": ");
                    salary[i] = input.nextInt();
                }
                
                System.out.print("Enter the value of k: ");
                int k = input.nextInt();
                
                findPairs(salary, k);
            }
            
            static void findPairs(int[] salary, int k) {
                for (int i = 0; i < salary.length; i++) {
                    for (int j = i+1; j < salary.length; j++) {
                        if (salary[i] + salary[j] == k && salary[i] != 0 && salary[j] != 0) {
                            System.out.println("Pair found: {" + salary[i] + ", " + salary[j] + "}");
                        }
                    }
                }
            }
        }
    
    

