
import java.util.Scanner;

public class Pibonachi {

	public static void main(String[] args) {
		// (����2) �Ǻ���ġ �������� n�ױ��� ��� ���� ����ϴ� �Լ��� �ۼ��Ͻÿ�. n���� scanner�� �Է¹��� ���� ����ϴ� ���·�.(��:10������ ����ġ�� 10�ױ����� �� ��µǰ�)
		// 1,1,2,3,5,8,.....,n
		
		
		  Scanner s = new Scanner(System.in);
		  System.out.print("n���� ���� �Է��Ͻÿ� : ");
		  int j=s.nextInt();
		  
		  
		  int num1,num2,sum;
		  num1=0; // ù ��°�� �� ��° ���� 1�̾�� �ϹǷ� �ʱⰪ�� 0��
		  num2=1; // 1�� �ش�
		  sum=1; // ù ��° 1�� �׳� �ʱⰪ���� ����
		  
		  for(int i=0; i<j; i++)
		  {
		      System.out.print(sum+" ");
		      sum=num1+num2; // �� ���� ���� ��
		      num1=num2;
		      num2=sum; // �� ��° �����ڿ� ���� ���� �־��ش�.
		  }
		
	

	}

}
