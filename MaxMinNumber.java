
public class MaxMinNumber {

	public static void main(String[] args) {
		//(����) 13,19,38,22,4 ���� �迭�� �����ϰ� �� ���� �� ���� ū ���� ���Ͻÿ�.
		// ���� ū ���� ��ġ(�迭�ε���)�� ���Ͻÿ�.
			// 1.ũ�� 5 �迭�� �� �����ϱ�
				int[] array = {13,19,38,22,4};
				
			// 2.for��, �ִ밪0, �ּҰ�0 �̿��� ���ϸ鼭 �ִ밪max, �ּҰ�min�� �� ����
				int max = array[0];
				int min = array[0];
				for(int i = 0; i < array.length; i++)
				{
					if(max<array[i])
					{	
						//max������ array[i]�� ũ�� max=array[i]
						max = array[i];
					}
					
					if(min>array[i])
					{
						//min������ array[i]�� ũ�� max=array[i]
						min = array[i];
					}
					
				}
				
			// 3.max��, min�� ���
				System.out.println("�ִ밪=" + max);
				System.out.println("�ּҰ�=" + min);	
				

	}

}
