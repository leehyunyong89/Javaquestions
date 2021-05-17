
public class LottoNumbersTeacherVersion {

	public static void main(String[] args) {
				// 1.번호가 저장될 배열만들기
				// 2.번호생성(랜덤번호)
				// 3.중복파악후 저장
				// 4.출력
				
				int nNumber;
				int [] arLotto = new int[6];	// 로또 번호가 저장될 배열
				
				boolean isExist = false;
				int pos = 0;
						
				while(pos < arLotto.length)
				{
					//1. 번호 추출
					nNumber = (int)(Math.random() * 45) + 1; // 1~45
				
					//2. 이번호가 존재하니?
					for (int k = 0; k < 6; k++)
					{
						// 이미 그 번호가 존재함.
						if (nNumber == arLotto[k])
						{				
							isExist = true;
							break;
						}
								
					}
				
					// 3. 존재하지 않는 새로운 번호면 로또 배열에 저장, pos++;
					if (isExist == false)
					{				
						arLotto[pos] = nNumber;
						pos++;
					
					}
					else
					{
						isExist = false;
						
						
					}
				
				}// end of while statement
				
				// 출력
				for (int i = 0; i < arLotto.length; i++)
					System.out.println(arLotto[i]);

	}

}
