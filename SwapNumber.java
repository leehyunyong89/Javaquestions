
public class SwapNumber {

	public static void main(String[] args) {
		//(����1)�� int ������ ���� �ٲٴ� Swap �Լ��� �ۼ��Ͻÿ� 
		// 1.���� int�� ���� temp�� �����.
		// 2.ũ�Ⱑ 2�� int�� �迭 ù ��° ����� ���� temp�� �ִ´�.
		// 3.ù ��° ����� ���� �� ��° ����� ���� �ִ´�.
		// 4.�� ��° ����� ���� int temp���� �ִ´�.
		
		//�Լ� ȣ��
		int a = 50;
		int b = 100;
		int[] arr = {a,b};
		
		swap(arr);
		
		System.out.println("a = " + arr[0] + ", b = " + arr[1]);	
		
		

	}
		//�Լ� ����
				public static void swap(int arr[])
					{
					int temp = arr[0];
					arr[0] = arr[1];
					arr[1] = temp;
					}
}
