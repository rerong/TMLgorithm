
public class Hide_Numbers{
	
	private int pnl;
	private char[] testNumber = new char[15];
	
	public String hide_number(String phoneNumber){		
		pnl = phoneNumber.length();	
		
		for(int i = 0 ; i< pnl ; i++){
									
			if(i < (pnl-4)){
				testNumber[i] = '*';
			}
			else if(i >= (pnl-4)){
				testNumber[i] = phoneNumber.charAt(i);
			}
			
			System.out.println(i + " " + testNumber[i]);
		}
		
		String hideNumber = new String(testNumber,0,testNumber.length);
		
		return hideNumber;
	}	
}
