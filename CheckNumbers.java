public class Exam 
{
	public static void main(String[] args) 
	{
		// �迭�� 0~12������ ���ڰ� �����ϴ��� �˻�.
		
		int rn;							// �����ѹ�.
		int [] arTarget = new int[20];	// �����ѹ��� ����
		int taget_value;				// Target�迭�� �� 
		
		
		boolean [] arTable = new boolean[13];
		
		for (int i = 0; i < arTable.length; i++)
			arTable[i] = false;
		

		// 0~12 ������ ������ ���� �����Ѵ�.
		// ������ ���ڸ� 20ũ���� �迭�� ���ʷ� �����Ѵ�.
		for (int i = 0; i < arTarget.length; i++)
		{
			rn = (int)(Math.random() * 13);
			arTarget[i] = rn;
			
		}
		
	
		// �����ѹ��� �˻�.
		for (int i = 0; i < arTarget.length; i++)
		{
			taget_value = arTarget[i];
			arTable[taget_value] = true;
			
		}
		
		for (int i = 0; i < arTable.length; i++)
		{
			if (arTable[i] == false)
				System.out.println(i + "���� �����ϴ�.");
		
			
		}
		
		System.out.println("���α׷� ��");
		
		
	}
	
}
