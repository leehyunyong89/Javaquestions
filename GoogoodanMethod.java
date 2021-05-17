
public class GoogoodanMethod {

	public static void main(String[] args) {
		// 구구단 함수 printDan();함수 만들고 호출해보기
		
		
		int dan = 2;
		
		// 2단부터 9단까지
		for (int i = 0; i < 8; i++)
		{
			System.out.println(dan + "단 출력 결과는 아래와 같습니다.");
			
			printDan(dan);
			dan++;
		}
		
}


		public static void printDan(int dan)
		{				
			int mul = 1;			
			
			for(int i = 0; i < 9; i++)
			{
				System.out.println(dan + " X " + mul + " = " + (dan * mul));			
				mul++;
			}
		
		}

}
