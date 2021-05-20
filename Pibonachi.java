
import java.util.Scanner;

public class Pibonachi {

	public static void main(String[] args) {
		// (문제2) 피보나치 수열에서 n항까지 모든 값을 출력하는 함수를 작성하시오. n항은 scanner로 입력받은 값을 출력하는 형태로.(예:10항으로 엔터치면 10항까지의 값 출력되게)
		// 1,1,2,3,5,8,.....,n
		
		
		  Scanner s = new Scanner(System.in);
		  System.out.print("n항의 값을 입력하시오 : ");
		  int j=s.nextInt();
		  
		  
		  int num1,num2,sum;
		  num1=0; // 첫 번째와 두 번째 값이 1이어야 하므로 초기값을 0과
		  num2=1; // 1로 준다
		  sum=1; // 첫 번째 1은 그냥 초기값으로 설정
		  
		  for(int i=0; i<j; i++)
		  {
		      System.out.print(sum+" ");
		      sum=num1+num2; // 두 값을 더한 후
		      num1=num2;
		      num2=sum; // 두 번째 연산자에 더한 값을 넣어준다.
		  }
		
	

	}

}
