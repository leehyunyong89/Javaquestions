



public class BubbleSort {

	public static void main(String[] args) {
		//�迭�� ����Ž���Ͽ� i, i+1��° ��Ҹ� ���Ͽ� ū ���� �ڷ� �̵�
				//�� ������ 1�� ó���Ǵ� ��� ���� ū ���� �迭 �������� ��ġ ��
				//���� Ž�����ʹ� ��������Ҵ� ���ص� �� (a.length-i-1 �� ���ִ� ������ ù���� �˻翡�� ���� ū���� �ǵڷ� ���� �Ǳ� ����.)( �׷��� ���ο� �ִ� for���� arr.length - i ������ Ž��)
				
				//�Լ� ȣ��
				int[] arr = {13,2,4,5,99,15};
				
				bubbleSort(arr);
				
				System.out.print("�ڵ����ĵ� �迭�� ");
				for(int i : arr)
				{
					System.out.print(i + " ");
				}
				System.out.println("�Դϴ�.");
	
	}
	
	//�Լ� ����
			public static void bubbleSort(int[] arr) 
					
				{
				    for(int i = 0; i < arr.length; i++) 
				    	{
				        	for(int j = 0 ; j < arr.length - i - 1 ; j++) 
				        		{
						            if(arr[j] > arr[j+1]) 
						            	{
						                int temp = arr[j+1];
						                arr[j+1] = arr[j];
						                arr[j] = temp;	
						            	}
	
				        		}
				    	}
				}
}


	