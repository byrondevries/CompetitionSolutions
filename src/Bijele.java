
// kattis ID: bijele (trivial)
public class Bijele {

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        int expected[] = { 1, 1, 2, 2, 2, 8 };
        int actual[] = new int[expected.length];
        
        for(int loop = 0; loop < actual.length; loop++) {
            
            actual[loop] = inputScanner.nextInt();
        }

        for(int loop = 0; loop < actual.length; loop++) {

            System.out.print(expected[loop] - actual[loop] + " ");
        }
        
    }

}
