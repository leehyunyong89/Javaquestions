
public class GoogoodanMethod {

	public static void main(String[] args) {
		// ������ �Լ� printDan();�Լ� ����� ȣ���غ���
		
		
		int dan = 2;
		
		// 2�ܺ��� 9�ܱ���
		for (int i = 0; i < 8; i++)
		{
			System.out.println(dan + "�� ��� ����� �Ʒ��� �����ϴ�.");
			
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
