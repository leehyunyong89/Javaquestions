
public class GetMaxNumbersMethod {

	public static void main(String[] args) {
		// (문제) 최대 최소값을 판정해주는 getMax()메소드----------------------------------
		
				int [] arSource = new int[] {13, 19, 33, 22, 4, 344, 566};
				
				int max_value = getMaxValue(arSource);
				int max_index = getMaxIndex(arSource);
				
				int min_value = getMinValue(arSource);
				int min_index = getMinIndex(arSource);
				
				System.out.println("Max Value = " + max_value);
				System.out.println("Max Index = " + max_index);
				System.out.println("Min Value = " + min_value);
				System.out.println("Min Index = " + min_index);
				
				
				
				
			}

			public static int getMaxValue(int[] ar) 
			{
				int max_value = ar[0];
				
				for(int i = 0; i < ar.length; i++)
				{					
					if(ar[i]>max_value)
					{	
						//max_value값보다 array[i]가 크면 max=array[i]
						max_value = ar[i];
					}				
				}		
				return max_value;		
			}
			
			
			public static int getMaxIndex(int[] ar) 
			{
				int max_value = ar[0];
				int max_index = ar[0];
				
				for(int i = 0; i < ar.length; i++)
				{					
					if(ar[i]>max_value)
					{	
						//max_value값보다 array[i]가 크면 max_value=array[i]
						max_value = ar[i];
						max_index = i;
					}				
				}		
				return max_index;		
			}
			
			
			public static int getMinValue(int[] ar) 
			{
				int min_value = ar[0];
				
				
				for(int i = 0; i < ar.length; i++)
				{					
					if(ar[i]<min_value)
					{	
						//min_value값보다 array[i]가 작으면 min_value=array[i]
						min_value = ar[i];		
					}				
				}		
				return min_value;		
			}
			
			
			
			
			
			public static int getMinIndex(int[] ar) 
			{
				int min_value = ar[0];
				int min_index = ar[0];
				
				for(int i = 0; i < ar.length; i++)
				{					
					if(ar[i]<min_value)
					{	
						//min_value값보다 array[i]가 작으면 min_value=array[i]
						min_value = ar[i];
						min_index = i;
					}				
				}		
				return min_index;	
		}

}
