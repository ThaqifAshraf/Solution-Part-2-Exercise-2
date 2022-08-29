package serverside;

public class VowelProcessor {

private int size = 65535;
	
	private String vowel;
	
	
	public VowelProcessor(byte[] byteData) {
		
		this.vowel = new String(byteData);
	}
	
	public String getvowel() {
		
		return vowel;
	}
	
	/**
	 * This method convert value into an array of byte
	 * @param length
	 * @return
	 */
	public byte[] convertToByteArray(int value) {
		
		byte[] outDataVowel = new byte[size];
		
		String stringValue = Integer.valueOf(value).toString();
		
        outDataVowel = stringValue.getBytes();
        
        return outDataVowel;
	}
	
	/**
	 * This method count the number of characters in a sentence
	 * @return
	 */
	public int countvowel() {
		
        int countvowel = 0;
        for (int i = 0; i <vowel.length(); i++) {
            // check if char[i] is vowel
            if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e'
                || vowel.charAt(i) == 'i'
                || vowel.charAt(i) == 'o'
                || vowel.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                countvowel++;
        
        

     
        
		
        }
            }
		return countvowel;
	}
}

	

