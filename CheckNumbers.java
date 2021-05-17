public class Exam 
{
	public static void main(String[] args) 
	{
		// 배열에 0~12사이의 숫자가 존재하는지 검사.
		
		int rn;							// 랜덤넘버.
		int [] arTarget = new int[20];	// 랜덤넘버가 저장
		int taget_value;				// Target배열의 값 
		
		
		boolean [] arTable = new boolean[13];
		
		for (int i = 0; i < arTable.length; i++)
			arTable[i] = false;
		

		// 0~12 사이의 임의의 값을 생성한다.
		// 생성된 숫자를 20크기의 배열에 차례로 저장한다.
		for (int i = 0; i < arTarget.length; i++)
		{
			rn = (int)(Math.random() * 13);
			arTarget[i] = rn;
			
		}
		
	
		// 랜덤넘버를 검사.
		for (int i = 0; i < arTarget.length; i++)
		{
			taget_value = arTarget[i];
			arTable[taget_value] = true;
			
		}
		
		for (int i = 0; i < arTable.length; i++)
		{
			if (arTable[i] == false)
				System.out.println(i + "값은 없습니다.");
		
			
		}
		
		System.out.println("프로그램 끝");
		
		
	}
	
}
