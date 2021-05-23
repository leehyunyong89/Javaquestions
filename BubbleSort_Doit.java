package arrayExam;
import java.util.Scanner;


public class BubbleSort_Doit {

	// a[idx1]와 a[idx2]의 값을 바꾸는 메소드
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;				
	}
	
	// 버블 정렬 메소드
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = n-1; j > i; j--)     // 두 수 비교 후 swap 메소드 호출
				if (a[j-1] > a[j]) 
					swap(a, j-1, j);			
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);  //입력값 받아서 배열 생성하는 과정 
		
		System.out.println("버블 정렬합니다.");
		System.out.print("요소수를 입력하세요 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.print("X[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		bubbleSort(x, nx); //배열 x를 버블 정렬합니다.
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("X[" + i + "] = " + x[i]);
		
	}

}
