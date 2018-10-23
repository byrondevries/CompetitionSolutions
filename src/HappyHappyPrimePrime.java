
// kattis ID: happyprime (medium)
public class HappyHappyPrimePrime {
    
    static int MAX = 10000;
    
    static boolean prime[] = new boolean[MAX+1];
    static int happy[] = new int[MAX+1];

    private static int YES = 0;
    private static int NO = 1;
    private static int UNKNOWN = -1;

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        // Generate all primes:
        generatePrimesAndInitializeHappy();
        
        int testCaseCount = inputScanner.nextInt();
        for(int loop = 0; loop < testCaseCount; loop++) {
         
            int testCaseID = inputScanner.nextInt();
            int testCase = inputScanner.nextInt();

            System.out.println(testCaseID + " " + testCase + " " + ((prime[testCase] && isHappyRecursive(testCase))?"YES":"NO"));
        }
        
        
    }

    private static void generatePrimesAndInitializeHappy() {
        
        for(int loop=0; loop<=MAX; loop++)  {
            prime[loop] = true; 
            happy[loop] = UNKNOWN; 
        }
          
        for(int loop = 2; loop*loop <= MAX; loop++) 
            if(prime[loop]) 
                for(int index = loop*2; index <= MAX; index += loop)
                    prime[index] = false; 
        
        prime[1] = false;
    }

    private static boolean isHappyRecursive(int testCase) {
        
        if(happy[testCase] == YES)
            return true;
        else if(happy[testCase] == NO)
            return false;
        
        int newTestCase = sumOfSquaredDigits(testCase);

        if(newTestCase == 1) {
            happy[testCase] = YES ;
            return true;

        } else if(newTestCase < 7) {
            
            happy[testCase] = NO;
            return false;                
            
        } else {
            
            if(isHappyRecursive(newTestCase)) {
                happy[testCase] = YES;
                return true;                
            } else {
                happy[testCase] = NO;
                return false;                
            }
        }

    }
    
    private static int sumOfSquaredDigits(int testCase) {
        int toReturn = 0;
        while(testCase >= 1) {
            
            toReturn += (testCase % 10) * (testCase % 10);
            testCase /= 10;
        }
        return toReturn;
    }

}
