package twentyTwenyone_June_2nd;

	// �迭 ũ�� �⺻ 5, �ִ� ������� �����ڷκ��� �Է¹޾Ƽ� ����
	// push �Լ�
	// pop �Լ�
	// ���� ť�� ����Ǿ� �ִ� ������ ����Լ� pringQ ����


public class IntQueue {
	
			// �ʵ�	
				final int DEF_SIZE = 5;
		
				private int max;		// ť�� �뷮
				private int front;		// ù ��° ��� Ŀ��
				private int rear;		// ������ ��� Ŀ��
				private int num;		// ���� ������ ��
				private int[] que;		// ť ��ü						
				
							
			// �⺻ ������
				public IntQueue () {
					this.max = DEF_SIZE;
					this.front = rear = num = 0;
					que = new int[DEF_SIZE];
				}
			
			
			// ������ �����ε� (�μ��� �޾Ƽ� �迭 ����� ������)
				public IntQueue (int max) {
					this.max = max;
					this.num = front = rear = 0;
					que = new int[max];   // ť ��ü�� �迭 ����					
				}
				
				
			// �޼ҵ�
				// �迭 �� á���� Ȯ�� �޼ҵ�
				private boolean isFull() {
					if(num == max)
						return true;	
					else
						return false;
				}
				
				// �迭 ������� Ȯ�� �޼ҵ�
				private boolean isEmpty() {
					if (num == 0)
						return true;
					else
						return false;
				}
				
				// ť�� �����͸� Ǫ���ϴ� �޼ҵ�
				public boolean push(int x) {
					if (isFull()) 
						return false; //ť�� ���� ��
					que[rear++] = x;
					num++;
					if (rear == max) 
						rear = 0; //rear�� max�� �����ϸ� 0���� �ʱ�ȭ
					return true;
				}
				
				// ť���� �����͸� ���ϴ� �޼ҵ�
				public boolean pop() {
					if (isEmpty()) 
						return false; //ť�� �������
					front++;
					num--;
					if (front == max) 
						front = 0; //front�� max�� �������� 0���� �ʱ�ȭ
					return true;
				}


				// ť�� �����͸� ����ϴ� �޼ҵ�
				public void printQ()
				{
					if (num <= 0) 
						System.out.println("ť�� ��� �ֽ��ϴ�.");
					else {
						for (int i = 0; i < num; i++) {
							System.out.println(que[(i + front) % num] + " ");
						  System.out.println();	
						}
					}		
				}



}
