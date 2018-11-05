// kattis ID: averagespeed
public class AverageSpeed {

    private static Double currentSpeed = 0.0;
	private static Double lastSeconds = -1.0;

	public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);
        
        double distance = 0.0;
        while(inputScanner.hasNextLine()) {

        		String line = inputScanner.nextLine();
        		if(line.length() < 8)
        			return;
            String inputs[] = line.split(" ");
            	
	    		double currentSeconds = getSeconds(inputs[0]);
	    		if(lastSeconds < 0)
	    			lastSeconds = currentSeconds;
	    		
	    		distance += currentSpeed * ((currentSeconds - lastSeconds) / (60*60));

        		lastSeconds = currentSeconds;

        		if(inputs.length == 1) {

            		System.out.println(inputs[0] + " " + String.format("%.2f", distance) + " km");
            		
            	} else if(inputs.length == 2) {

            		currentSpeed = Double.valueOf(inputs[1]);
            	} else {
            		return;
            	}
        	
        }
    }

	private static double getSeconds(String timeString) {

		String time[] = timeString.split(":");
		double hours = Double.valueOf(time[0]);
		double minutes = Double.valueOf(time[1]);
		return hours * 60 * 60 + minutes * 60 + Double.valueOf(time[2]);
	}

}
