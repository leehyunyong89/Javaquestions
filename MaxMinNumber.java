
public class MaxMinNumber {

	public static void main(String[] args) {
		//(문제) 13,19,38,22,4 값을 배열에 저장하고 이 값들 중 가장 큰 값을 구하시오.
		// 가장 큰 값의 위치(배열인덱스)를 구하시오.
			// 1.크기 5 배열에 값 저장하기
				int[] array = {13,19,38,22,4};
				
			// 2.for문, 최대값0, 최소값0 이용해 비교하면서 최대값max, 최소값min에 값 저장
				int max = array[0];
				int min = array[0];
				for(int i = 0; i < array.length; i++)
				{
					if(max<array[i])
					{	
						//max값보다 array[i]가 크면 max=array[i]
						max = array[i];
					}
					
					if(min>array[i])
					{
						//min값보다 array[i]가 크면 max=array[i]
						min = array[i];
					}
					
				}
				
			// 3.max값, min값 출력
				System.out.println("최대값=" + max);
				System.out.println("최소값=" + min);	
				

	}

}
