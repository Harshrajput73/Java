
public class GoldBAr {
    public static void main(String[] args) {
        int numDays = 7;
        int numGoldBars = 7;
        int numCuts = 0;

        while (numGoldBars > numDays) {
            numGoldBars = numGoldBars - numDays;
            numCuts++;
        }

        System.out.println("The minimum number of cuts in the chain of gold bars is: " + numCuts);
    }

    
    }

