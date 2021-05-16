package sec01.exam03;

public class PracticeJava_Array_MultipleInitialization {

	public static void main(String[] args) {
		// (문제)int [3][4] 배열을 1~12까지의 수로 초기화하는 루프문을 작성하시오.
			// 1.전체 크기가 3, 각 인덱스 속에 크기가 4인 다차원 배열(int형) Numbers 만들기
				int[][] numbers = new int[3][4];		
			
			// 2.Numbers 배열의 모든 값들을 1로 초기화하는 루프문 만들기
				int num = 1;
				
				for(int t = 0; t <12; t++)
				{
					for(int i = 0; i < numbers.length; i++)
						{
							for(int k = 0; k < numbers[i].length; k++)
							{
								numbers[i][k] = num;
								System.out.println("numbers[" + i + "]" + "[" + k + "]" + "=" + numbers[i][k]);					
							}						
						}
					System.out.println(" ");	
					num++;;
				}	 
						
				//3.12까지 반복하기 (2번 과정에서 가장 첫 번째 for문 추가함으로써 해결함)

	}

}
