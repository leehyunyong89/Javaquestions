package twentyTwentyOne_May_24th;

public class CodeTest {

	public static void main(String[] args) {
		int[] arr = {56,44,87,90,68,98,77,90,97,98};

		bubbleSort(arr);
		printArray(arr);		

	}

	//bubbleSort 함수 구현-------------------------------------------------------------//
	public static boolean bubbleSort(int[] arr) {
		
		    for(int i = 0; i < arr.length; i++) {
		    	
		    		if(arr[i]<0) {
		    			return false;
		    		}
		    		
		    		else {
			        	for(int j = 0 ; j < arr.length - i - 1 ; j++) {			        		
					            if(arr[j] < arr[j+1]) {   //swap 기능 구현					            	
					                int temp = arr[j+1];
					                arr[j+1] = arr[j];
					                arr[j] = temp;	
					            	}
			        		}
		    		}
		    }
		    return true;
	}
	//------------------------------------------------------------------------------
	
	
	//printArray 함수 구현-------------------------------------------------------------//
	public static void printArray(int[] arr) {	
			
				int j = 1;
				for(int i = 0; i<arr.length; i++) {
					System.out.println(j + "등 점수 : " + arr[i]);
					j++;
				}    	    	
	}
	//------------------------------------------------------------------------------//
}
