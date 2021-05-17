
public class LottoNumbers {

	public static void main(String[] args) {
		// (문제) 로또 번호 생성하는 프로그램을 짜시오. ---------------------------------------------------------------
		
					// 1.생성된 숫자를 크기가 6인 int형 배열 만들기
						int[] lotto = new int[6];		
				
					// 2.1부터 시작해서 45까지의 숫자를 임의로 생성하고 1번 배열에 넣기 (for문은 6바퀴)
						for(int i=0; i<6; i++)
						{
						lotto[i] = (int)(Math.random()*45)+1;
						
							//중복 숫자 제거. -> 지금뽑은 숫자가 이전에 뽑은 숫자들 중 같은 값이 있다면 i를 증가시키지 말고 다시 뽑는 알고리즘
							for(int j=0; j<i; j++) 
							{
								if(lotto[i] == lotto[j]) 
								{
									i--;
									break;
								}
							}
						}
						System.out.print("로또 번호: ");				
					// 3.번호 출력	
						for(int i=0; i<6; i++)
						{
							System.out.print(lotto[i] + " ");
						}	

	}

}
