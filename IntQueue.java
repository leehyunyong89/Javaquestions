package twentyTwenyone_June_2nd;

	// 배열 크기 기본 5, 최대 사이즈는 생성자로부터 입력받아서 구현
	// push 함수
	// pop 함수
	// 현재 큐에 저장되어 있는 데이터 출력함수 pringQ 구현


public class IntQueue {
	
			// 필드	
				final int DEF_SIZE = 5;
		
				private int max;		// 큐의 용량
				private int front;		// 첫 번째 요소 커서
				private int rear;		// 마지막 요소 커서
				private int num;		// 현재 데이터 수
				private int[] que;		// 큐 본체						
				
							
			// 기본 생성자
				public IntQueue () {
					this.max = DEF_SIZE;
					this.front = rear = num = 0;
					que = new int[DEF_SIZE];
				}
			
			
			// 생성자 오버로딩 (인수값 받아서 배열 만드는 생성자)
				public IntQueue (int max) {
					this.max = max;
					this.num = front = rear = 0;
					que = new int[max];   // 큐 본체용 배열 생성					
				}
				
				
			// 메소드
				// 배열 꽉 찼는지 확인 메소드
				private boolean isFull() {
					if(num == max)
						return true;	
					else
						return false;
				}
				
				// 배열 비었는지 확인 메소드
				private boolean isEmpty() {
					if (num == 0)
						return true;
					else
						return false;
				}
				
				// 큐에 데이터를 푸쉬하는 메소드
				public boolean push(int x) {
					if (isFull()) 
						return false; //큐가 가득 참
					que[rear++] = x;
					num++;
					if (rear == max) 
						rear = 0; //rear가 max에 도달하면 0으로 초기화
					return true;
				}
				
				// 큐에서 데이터를 팝하는 메소드
				public boolean pop() {
					if (isEmpty()) 
						return false; //큐가 비어있음
					front++;
					num--;
					if (front == max) 
						front = 0; //front가 max와 같아지면 0으로 초기화
					return true;
				}


				// 큐의 데이터를 출력하는 메소드
				public void printQ()
				{
					if (num <= 0) 
						System.out.println("큐가 비어 있습니다.");
					else {
						for (int i = 0; i < num; i++) {
							System.out.println(que[(i + front) % num] + " ");
						  System.out.println();	
						}
					}		
				}



}
