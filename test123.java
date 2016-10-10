
public class test {

	public static void main(String[] args) {
		int[] array = {15, 20, 30, 36};
		
		int value = average(array);
		
		System.out.println(value);

	}
	
	static int average(int[] array){
		int total = 0;
		int average = 0;
		
		for(int i = 0 ; i < array.length ; i++){
			total = total + array[i];
		}
		
		average =  total / array.length ;		
		
		return average;
	}
	
}
