package sec01.exam03;

public class TempExam {

	public static void main(String[] args) {
		
		//0~12 사이의 임의의 값을 생성하시오(random)  
		//생성된 숫자를 50크기의 int배열에 차례로 저장하시오 
		//0~12사이의 모든 숫자가 이 배열에 들어있는지 검사하는 프로그램을 작성하시오.
		
		//1. 0~12사이의 랜던값을 생성한다. 그리고 그 값을 배열에 저장한다.
		 int rn;
		 int[] arTarget = new int[50];
		 
		 
		 for (int i = 0; i < 50; i++)
		 {
		 	rn = (int)(Math.random() * 13);
		 	arTarget[i] = rn;
		 }
		 
		 
		 
		//2. 결과 저장 테이블을 만든다.(룩업테이블을 만든다.)
		 boolean[] arTable = new boolean[13];
		 	 
		 for(int i = 0; i < 13; i++)
			 arTable[i] = false;
		 
		 
		 //3. 랜덤값에 따라 결과저장테이블의 해당 숫자의 값을 true로 설정합니다.
		 int value;
		 for(int i = 0; i < 50; i++)
		 {
			 value = arTarget[i];
			 arTable[value] = true;			 
		 }
		 
		 
		 //4. 결과 저장 테이블에 false가 남아 있다면 0부터 12가 모두 있는 게 아니다.
		 boolean isAll = true;
		 for(int i = 0; i < 13; i++)
		 {
			 if(arTable[i]==false)
			 {
				 isAll = false;
				 break;
			 }			 
		 }
		 
		 if(isAll == true)
		 {
			 System.out.println("0부터 12까지 모두 들어가있습니다.");			
		 }
		 else
		 {
			 System.out.println("0부터 12중 없는 숫자가 있습니다.");
		 }		 
	}

}
