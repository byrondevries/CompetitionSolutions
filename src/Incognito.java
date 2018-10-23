import java.util.HashMap;
import java.util.Map.Entry;

// kattis ID: incognito (medium)
public class Incognito {

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        int testCaseCount = inputScanner.nextInt();
        for(int loop = 0; loop < testCaseCount; loop++) {
            HashMap<String, Integer> attributesPerCategory = new HashMap<>();
            
            int attributeCount = inputScanner.nextInt();
            for(int attribute = 0; attribute < attributeCount; attribute++) {
                
                String attributeName = inputScanner.next();
                String attributeCategory = inputScanner.next();
                
                if(attributesPerCategory.containsKey(attributeCategory)) {
                    
                    int newCount = attributesPerCategory.get(attributeCategory);
                    attributesPerCategory.put(attributeCategory, newCount+1);
                    
                } else {
                    
                    attributesPerCategory.put(attributeCategory, 1);
                }
            }
            
            int disguises = 1;
            for(Entry<String, Integer> entry : attributesPerCategory.entrySet()) {
                
                disguises *= (entry.getValue() + 1);
            }
            
            System.out.println(disguises-1);
        }

        
    }

}
