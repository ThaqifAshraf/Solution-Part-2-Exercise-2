package serverside;

public class ConsonantProcessor {

private int size = 65535;
	
	private String consonant;
	
	
	public ConsonantProcessor(byte[] byteData) {
		
		this.consonant = new String(byteData);
	}
	
	public String getconsonant() {
		
		return consonant;
	}
	
	/**
	 * This method convert value into an array of byte
	 * @param length
	 * @return
	 */
	public byte[] convertToByteArray(int value) {
		
		byte[] outDataConsonant = new byte[size];
		
		String stringValue = Integer.valueOf(value).toString();
		
        outDataConsonant = stringValue.getBytes();
        
        return outDataConsonant;
	}
	
	/**
	 * This method count the number of characters in a sentence
	 * @return
	 */
	public int countconsonant() {
		
        int countconsonant = 0;
        for (int i = 0; i < consonant.length(); ++i) {
            char ch = consonant.charAt(i);
            if ((ch >= 'a' && ch <= 'z')) {
                ++countconsonant;
        }
        

        
	}
		return countconsonant;
	}
}
	

