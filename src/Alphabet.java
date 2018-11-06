// kattis ID: alphabet
public class Alphabet {

    static char alphabetCharacters[] = null;

    public static void main(String[] args) {
        
        java.util.Scanner inputScanner = new java.util.Scanner(System.in);

        String inputAlphabet = inputScanner.nextLine();
        
        alphabetCharacters = new char[inputAlphabet.length()];
        boolean includedCharacters[] = new boolean[inputAlphabet.length()];
        
        for(int loop = 0; loop < inputAlphabet.length(); loop++) {
        		alphabetCharacters[loop] = inputAlphabet.charAt(loop);
        		includedCharacters[loop] = true;
        }

        System.out.println(process(includedCharacters, 0, (char) ('a'-1)));
        
    }

	private static int process(boolean[] includedCharacters, int depth, char lastChar) {

		if(depth >= includedCharacters.length) {
			
			return calculateMin(includedCharacters);
		}
		
		// Don't include any characters earlier than we already have
		int onMinimum = Integer.MAX_VALUE;
		if(lastChar < alphabetCharacters[depth]) {
			includedCharacters[depth] = true;
			onMinimum = process(includedCharacters, depth+1, alphabetCharacters[depth]);
		}
		
		// Only go down false branch if the characters aren't next to one another (e.g., "ab" you skip, "ac" you don't)
		int offMinimum = Integer.MAX_VALUE;
		if(lastChar + 1 != alphabetCharacters[depth]) {
			includedCharacters[depth] = false;
			offMinimum = process(includedCharacters, depth+1, lastChar);
		}
		
		if(onMinimum < offMinimum)
			return onMinimum;
		else
			return offMinimum;
	}

	private static int calculateMin(boolean[] includedCharacters) {

		// Output Included Character Booleans
//		for(boolean includedCharacter : includedCharacters) {
//			System.out.print(includedCharacter?"1":"0");
//		}
//		System.out.println();
		
		int count = 0;
		
		char lastChar = 'a'-1;
		for(int loop = 0; loop < includedCharacters.length; loop++) {

			if(includedCharacters[loop]) {
				if(lastChar >= alphabetCharacters[loop])
					return Integer.MAX_VALUE;
				else {
					count += (alphabetCharacters[loop] - lastChar) - 1;
					
					lastChar = alphabetCharacters[loop];
				}
			}
		}
		
		count += ('z' - lastChar);

		return count;
	}



}
