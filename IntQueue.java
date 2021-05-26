package twentyTwentyOne_May_26th;

public class IntQueue {

		// 필드
			
			final int DEF_SIZE = 10;
	
			private int max;		// 큐의 용량
			private int front;		// 첫 번째 요소 커서
			private int rear;		// 마지막 요소 커서
			private int num;		// 현재 데이터 수
			private int[] que;		// 큐 본체
			
			
			
		// 예외처리 : 큐가 비어 있을 경우 예외처리
			public class EmptyIntQueueException extends RuntimeException {
				public EmptyIntQueueException () {}
			}
			
			
		// 예외처리 : 큐가 가득 차 있을 경우 예외처리
		public class OverflowIntQueueException extends RuntimeException {
			public OverflowIntQueueException () {}
		}
			
						
		// 기본 생성자
			public IntQueue () {
				this.max = DEF_SIZE;
				this.front = rear = num = 0;
				que = new int[DEF_SIZE];
			}
		
		
		// 생성자 오버로딩 (인수값 받아서 배열 만드는 생성자)
			public IntQueue (int capacity) {
				this.max = capacity;
				this.num = front = rear = 0;
				try {
					que = new int[max];   // 큐 본체용 배열 생성
				} catch (OutOfMemoryError e) {  // 생성할 수 없음
					max = 0;
				}
			}
			
			
		// 메소드
			// 큐에 데이터를 인큐하는 메소드
			public int enque(int x) throws OverflowIntQueueException {
				if (num>=max) 
					throw new OverflowIntQueueException();   // 큐가 가득 참
				que[rear++] = x;
				num++;
				if (rear == max)
					rear = 0;
				return x;
			}
			

			// 큐에서 데이터를 디큐하는 메소드
			public int deque() throws EmptyIntQueueException {
				if (num <= 0)
					throw new EmptyIntQueueException();   // 큐가 비어 있음
				int x = que[front++];
				num--;
				if (front == max)
					front = 0;
				return x;
			}
			
			
	
}


			/*
			 * 실행 예시 
			 * IntQueue iq1 = new IntQueue();
			 * 
			 * iq1.enque(100); 
			 * iq1.enque(200); 
			 * iq1.enque(300); 
			 * iq1.enque(400); 
			 * iq1.enque(500);
			 * 
			 *  
			 * iq1.deque(); 
			 * iq1.deque();
			 * iq1.deque();
			 * iq1.deque();
			 * iq1.deque();
			 * iq1.deque();
			 */



