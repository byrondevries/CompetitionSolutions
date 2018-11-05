import java.util.HashSet;

// kattis ID: modulo
public class NoDuplicates {

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        	String sentance = inputScanner.nextLine();
        	
        	String words[] = sentance.split(" ");
        	
    		HashSet<String> uniqueWords = new HashSet<String>();
        	for(String word : words) {
        		
        		if(uniqueWords.contains(word)) {
        			System.out.println("no");
        			return;
        		} else
        			uniqueWords.add(word);
        	}
        	
        	System.out.println("yes");
        
    }

}
