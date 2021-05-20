



public class BubbleSort {

	public static void main(String[] args) {
		//배열을 순차탐색하여 i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동
				//위 과정이 1번 처리되는 경우 가장 큰 수가 배열 마지막에 위치 함
				//다음 탐색부터는 마지막요소는 안해도 됨 (a.length-i-1 을 해주는 이유는 첫바퀴 검사에서 가장 큰값이 맨뒤로 가게 되기 때문.)( 그래서 내부에 있는 for문은 arr.length - i 까지만 탐색)
				
				//함수 호출
				int[] arr = {13,2,4,5,99,15};
				
				bubbleSort(arr);
				
				System.out.print("자동정렬된 배열은 ");
				for(int i : arr)
				{
					System.out.print(i + " ");
				}
				System.out.println("입니다.");
	
	}
	
	//함수 구현
			public static void bubbleSort(int[] arr) 
					
				{
				    for(int i = 0; i < arr.length; i++) 
				    	{
				        	for(int j = 0 ; j < arr.length - i - 1 ; j++) 
				        		{
						            if(arr[j] > arr[j+1]) 
						            	{
						                int temp = arr[j+1];
						                arr[j+1] = arr[j];
						                arr[j] = temp;	
						            	}
	
				        		}
				    	}
				}
}


	