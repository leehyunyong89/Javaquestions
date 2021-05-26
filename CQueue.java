
public class CQueue {
	//추상화 단계
	final int DEF_SIZE = 10;
	private int mSize;			// 큐사이즈
	private int[] mData;		// 데이터 저장배열
	private int mCount;			// 현재 데이터 개수
		
	private int mFront;			// 큐의 머리
	private int mRear;			// 큐의 뒤
	
	//생성자
	CQueue()
	{
		mSize = DEF_SIZE;
		mData = new int[DEF_SIZE];
		mCount = 0;
		
		mFront = 0;
		mRear = 0;
		
	}
	
	CQueue(int size)
	{
		mSize = size;
		mData = new int[size];
		mCount = 0;
		
		mFront = 0;
		mRear = 0;
			
	}
	
	// 꽉찻니?
	private boolean isFull()
	{
		if(mCount == mSize)
			return true;	
		else
			return false;
		
	}
	
	// 비었니?
	private boolean isEmpty()
	{
		if (mCount == 0)
			return true;
		else
			return false;
	}
	
	
	// 데이터를 큐에 넣는다.
	public boolean put(int data)
	{
		if (true == isFull())
			return false;
				
		mData[mRear] = data;
		
		mRear = (mRear + 1) % mSize;
		
		mCount++;
		return true;
	
	}
	

	// pop만 한다.
	public boolean pop()
	{
		if (true == isEmpty())
			return false;
		
		mFront = (mFront + 1) % mSize;		
		
		mCount--;
		return true;
	}

	
	// 데이터를 가지고 오고 pop까지 한다.	
	public boolean get(int[] ar)
	{
		if (true == isEmpty())
			return false;
		
		ar[0] = mData[mFront];
		
		mFront = (mFront + 1) % mSize;		

		mCount--;
		return true;
	}
	
	
	// 큐의 데이터를 출력한다.
	public void printCQ()
	{
		
		
	}

}
