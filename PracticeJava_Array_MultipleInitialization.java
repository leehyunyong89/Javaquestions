package sec01.exam03;

public class PracticeJava_Array_MultipleInitialization {

	public static void main(String[] args) {
		// (����)int [3][4] �迭�� 1~12������ ���� �ʱ�ȭ�ϴ� �������� �ۼ��Ͻÿ�.
			// 1.��ü ũ�Ⱑ 3, �� �ε��� �ӿ� ũ�Ⱑ 4�� ������ �迭(int��) Numbers �����
				int[][] numbers = new int[3][4];		
			
			// 2.Numbers �迭�� ��� ������ 1�� �ʱ�ȭ�ϴ� ������ �����
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
						
				//3.12���� �ݺ��ϱ� (2�� �������� ���� ù ��° for�� �߰������ν� �ذ���)

	}

}
