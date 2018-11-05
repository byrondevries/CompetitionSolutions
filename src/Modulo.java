import java.util.HashSet;

// kattis ID: modulo
public class Modulo {

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

		HashSet<Integer> uniqueModulos = new HashSet<Integer>();
        for(int loop = 0; loop < 10; loop++) {
        		uniqueModulos.add(inputScanner.nextInt()%42);
        }
        
        System.out.println(uniqueModulos.size());
        
    }

}
