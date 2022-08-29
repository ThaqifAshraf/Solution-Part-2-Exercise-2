package serverside;

public class PunctuationProcessor {

private int size = 65535;
	
	private String punctuation;
	
	
	public PunctuationProcessor(byte[] byteData) {
		
		this.punctuation = new String(byteData);
	}
	
	public String getpunctuation() {
		
		return punctuation;
	}
	
	/**
	 * This method convert value into an array of byte
	 * @param length
	 * @return
	 */
	public byte[] convertToByteArray(int value) {
		
		byte[] outDataPunctuation = new byte[size];
		
		String stringValue = Integer.valueOf(value).toString();
		
        outDataPunctuation = stringValue.getBytes();
        
        return outDataPunctuation;
	}
	
	/**
	 * This method count the number of characters in a sentence
	 * @return
	 */
	public int countpunctuation() {
		
        int countpunctuation = 0;
        for (int i = 0; i < punctuation.length(); ++i) {
            char ch = punctuation.charAt(i);
            if(punctuation.charAt(i) == '!' || punctuation.charAt(i) == ',' || punctuation.charAt(i) == ';' || punctuation.charAt(i) == '.' ||  punctuation.charAt(i) == '?' || punctuation.charAt(i) == '-' ||    
            		punctuation.charAt(i) == '\'' || punctuation.charAt(i) == '\"' || punctuation.charAt(i) == ':')   
            		{    
            		countpunctuation++;  
        }
        

        
	}
		return countpunctuation;
	}
}
