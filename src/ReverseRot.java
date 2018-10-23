
// kattis ID: reverserot (easy)
public class ReverseRot {

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        String locationAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        String rotationAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        
        int rotation;
        while((rotation = inputScanner.nextInt()) != 0) {
            String toRotate = inputScanner.next();

            for(int loop = toRotate.length()-1; loop >= 0; loop--) {
                
                System.out.print(rotationAlphabet.charAt(rotation + locationAlphabet.indexOf(toRotate.charAt(loop),0)));
            }
            System.out.println();
        }

        
    }

}
