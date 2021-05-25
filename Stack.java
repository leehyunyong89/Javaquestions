package twentyTwenyone_May_25th;




public class Stack {

	//�ʵ�
	
	final int DEF_SIZE = 10;
	
	private int [] mData;  	//���� ������
	private int mPos;   	//��ġ����(Stack Pointer)
	private int mSize;  	//�迭 ũ��

	
	//�⺻������ (�迭ũ�� 10����)
	public Stack() {
		mData = new int[DEF_SIZE];
		mPos = -1;
		mSize = DEF_SIZE;
	}
	
	//�����ε��� ������
	public Stack(int size) {
		mData = new int[size];
		mPos = -1;
		mSize = size;
	}
	
	
	//�޼ҵ�
		//Ǫ�� �޼ҵ�
		boolean push(int data) {
			if (mPos < mSize - 1){
				mPos++;
				mData[mPos] = data;
			}
			else
				return false;
			
			return true;
		}
		
		//�� �޼ҵ�
		boolean pop() {
			if (mPos != -1) {
				mData[mPos] = 0;
				mPos--;
				return true;
			}
			return false;
		}	
		
		//������ ������ ���� �޼ҵ�
		boolean getData(int [] ar) {
			if (mPos != -1) {
				ar[0] = mData[mPos];
				return true;
			}
			return false;
		}
	
	//���๮----------------------------------------//	
	public static void main(String[] args) {
			
			Stack st1 = new Stack(5);
			
			boolean res;
			st1.push(100);
			st1.push(200);
			
			res = st1.pop();
			res = st1.pop();
			res = st1.pop();			

		}
		
	
}
