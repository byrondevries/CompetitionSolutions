import java.util.Vector;

// kattis ID: hurricanedanger (hard)
public class HurricaneDanger {

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        int testCases = inputScanner.nextInt();
        for(int testCase = 0; testCase < testCases; testCase++) {
            
            double minDistance = Double.MAX_VALUE;
            Vector<String> worstCaseCity = new Vector<String>();
            
            double x1 = inputScanner.nextInt();
            double y1 = inputScanner.nextInt();
            double x2 = inputScanner.nextInt();
            double y2 = inputScanner.nextInt();
            
            int cityCount = inputScanner.nextInt();
            for(int city = 0; city < cityCount; city++) {
                
                String cityName = inputScanner.next();
                double x = inputScanner.nextInt();
                double y = inputScanner.nextInt();
                
                double distance = distanceFromHuricane(x1, y1, x2, y2, x, y);

                if(distance < minDistance) {
                    minDistance = distance;
                    
                    worstCaseCity = new Vector<String>();
                    worstCaseCity.add(cityName);
                } else if(distance == minDistance) {
                    
                    worstCaseCity.add(cityName);
                }
                    
            }
            
            for(String cityName : worstCaseCity)
                System.out.print(cityName + " ");
            System.out.println();
            
        }

        
    }

    private static double distanceFromHuricane(double x1, double y1, double x2, double y2, double x, double y) {

        return Math.abs((y2-y1)*x - (x2-x1)*y + x2*y1 - y2*x1) / Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));
    }

}
