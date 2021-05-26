package twentyTwentyOne_May_26th;

public class IntQueue {

		// �ʵ�
			
			final int DEF_SIZE = 10;
	
			private int max;		// ť�� �뷮
			private int front;		// ù ��° ��� Ŀ��
			private int rear;		// ������ ��� Ŀ��
			private int num;		// ���� ������ ��
			private int[] que;		// ť ��ü
			
			
			
		// ����ó�� : ť�� ��� ���� ��� ����ó��
			public class EmptyIntQueueException extends RuntimeException {
				public EmptyIntQueueException () {}
			}
			
			
		// ����ó�� : ť�� ���� �� ���� ��� ����ó��
		public class OverflowIntQueueException extends RuntimeException {
			public OverflowIntQueueException () {}
		}
			
						
		// �⺻ ������
			public IntQueue () {
				this.max = DEF_SIZE;
				this.front = rear = num = 0;
				que = new int[DEF_SIZE];
			}
		
		
		// ������ �����ε� (�μ��� �޾Ƽ� �迭 ����� ������)
			public IntQueue (int capacity) {
				this.max = capacity;
				this.num = front = rear = 0;
				try {
					que = new int[max];   // ť ��ü�� �迭 ����
				} catch (OutOfMemoryError e) {  // ������ �� ����
					max = 0;
				}
			}
			
			
		// �޼ҵ�
			// ť�� �����͸� ��ť�ϴ� �޼ҵ�
			public int enque(int x) throws OverflowIntQueueException {
				if (num>=max) 
					throw new OverflowIntQueueException();   // ť�� ���� ��
				que[rear++] = x;
				num++;
				if (rear == max)
					rear = 0;
				return x;
			}
			

			// ť���� �����͸� ��ť�ϴ� �޼ҵ�
			public int deque() throws EmptyIntQueueException {
				if (num <= 0)
					throw new EmptyIntQueueException();   // ť�� ��� ����
				int x = que[front++];
				num--;
				if (front == max)
					front = 0;
				return x;
			}
			
			
	
}


			/*
			 * ���� ���� 
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



