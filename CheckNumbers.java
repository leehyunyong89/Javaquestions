package sec01.exam03;

public class TempExam {

	public static void main(String[] args) {
		
		//0~12 ������ ������ ���� �����Ͻÿ�(random)  
		//������ ���ڸ� 50ũ���� int�迭�� ���ʷ� �����Ͻÿ� 
		//0~12������ ��� ���ڰ� �� �迭�� ����ִ��� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		//1. 0~12������ �������� �����Ѵ�. �׸��� �� ���� �迭�� �����Ѵ�.
		 int rn;
		 int[] arTarget = new int[50];
		 
		 
		 for (int i = 0; i < 50; i++)
		 {
		 	rn = (int)(Math.random() * 13);
		 	arTarget[i] = rn;
		 }
		 
		 
		 
		//2. ��� ���� ���̺��� �����.(������̺��� �����.)
		 boolean[] arTable = new boolean[13];
		 	 
		 for(int i = 0; i < 13; i++)
			 arTable[i] = false;
		 
		 
		 //3. �������� ���� ����������̺��� �ش� ������ ���� true�� �����մϴ�.
		 int value;
		 for(int i = 0; i < 50; i++)
		 {
			 value = arTarget[i];
			 arTable[value] = true;			 
		 }
		 
		 
		 //4. ��� ���� ���̺� false�� ���� �ִٸ� 0���� 12�� ��� �ִ� �� �ƴϴ�.
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
			 System.out.println("0���� 12���� ��� ���ֽ��ϴ�.");			
		 }
		 else
		 {
			 System.out.println("0���� 12�� ���� ���ڰ� �ֽ��ϴ�.");
		 }		 
	}

}
