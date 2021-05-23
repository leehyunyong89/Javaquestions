package arrayExam;
import java.util.Scanner;


public class BubbleSort_Doit {

	// a[idx1]�� a[idx2]�� ���� �ٲٴ� �޼ҵ�
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;				
	}
	
	// ���� ���� �޼ҵ�
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = n-1; j > i; j--)     // �� �� �� �� swap �޼ҵ� ȣ��
				if (a[j-1] > a[j]) 
					swap(a, j-1, j);			
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);  //�Է°� �޾Ƽ� �迭 �����ϴ� ���� 
		
		System.out.println("���� �����մϴ�.");
		System.out.print("��Ҽ��� �Է��ϼ��� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("X[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx); //�迭 x�� ���� �����մϴ�.
		
		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < nx; i++)
			System.out.println("X[" + i + "] = " + x[i]);
		
	}

}
