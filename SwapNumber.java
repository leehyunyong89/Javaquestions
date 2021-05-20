
public class SwapNumber {

	public static void main(String[] args) {
		//(문제1)두 int 변수의 값을 바꾸는 Swap 함수를 작성하시오 
		// 1.임의 int형 변수 temp을 만든다.
		// 2.크기가 2인 int형 배열 첫 번째 요소의 값을 temp에 넣는다.
		// 3.첫 번째 요소의 값에 두 번째 요소의 값을 넣는다.
		// 4.두 번째 요소의 값에 int temp값을 넣는다.
		
		//함수 호출
		int a = 50;
		int b = 100;
		int[] arr = {a,b};
		
		swap(arr);
		
		System.out.println("a = " + arr[0] + ", b = " + arr[1]);	
		
		

	}
		//함수 생성
				public static void swap(int arr[])
					{
					int temp = arr[0];
					arr[0] = arr[1];
					arr[1] = temp;
					}
}
