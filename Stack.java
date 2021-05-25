package twentyTwenyone_May_25th;




public class Stack {

	//필드
	
	final int DEF_SIZE = 10;
	
	private int [] mData;  	//스택 프레임
	private int mPos;   	//위치정보(Stack Pointer)
	private int mSize;  	//배열 크기

	
	//기본생성자 (배열크기 10으로)
	public Stack() {
		mData = new int[DEF_SIZE];
		mPos = -1;
		mSize = DEF_SIZE;
	}
	
	//오버로딩된 생성자
	public Stack(int size) {
		mData = new int[size];
		mPos = -1;
		mSize = size;
	}
	
	
	//메소드
		//푸쉬 메소드
		boolean push(int data) {
			if (mPos < mSize - 1){
				mPos++;
				mData[mPos] = data;
			}
			else
				return false;
			
			return true;
		}
		
		//팝 메소드
		boolean pop() {
			if (mPos != -1) {
				mData[mPos] = 0;
				mPos--;
				return true;
			}
			return false;
		}	
		
		//데이터 가지고 오는 메소드
		boolean getData(int [] ar) {
			if (mPos != -1) {
				ar[0] = mData[mPos];
				return true;
			}
			return false;
		}
	
	//실행문----------------------------------------//	
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
