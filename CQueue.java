
public class CQueue {
	//�߻�ȭ �ܰ�
	final int DEF_SIZE = 10;
	private int mSize;			// ť������
	private int[] mData;		// ������ ����迭
	private int mCount;			// ���� ������ ����
		
	private int mFront;			// ť�� �Ӹ�
	private int mRear;			// ť�� ��
	
	//������
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
	
	// ������?
	private boolean isFull()
	{
		if(mCount == mSize)
			return true;	
		else
			return false;
		
	}
	
	// �����?
	private boolean isEmpty()
	{
		if (mCount == 0)
			return true;
		else
			return false;
	}
	
	
	// �����͸� ť�� �ִ´�.
	public boolean put(int data)
	{
		if (true == isFull())
			return false;
				
		mData[mRear] = data;
		
		mRear = (mRear + 1) % mSize;
		
		mCount++;
		return true;
	
	}
	

	// pop�� �Ѵ�.
	public boolean pop()
	{
		if (true == isEmpty())
			return false;
		
		mFront = (mFront + 1) % mSize;		
		
		mCount--;
		return true;
	}

	
	// �����͸� ������ ���� pop���� �Ѵ�.	
	public boolean get(int[] ar)
	{
		if (true == isEmpty())
			return false;
		
		ar[0] = mData[mFront];
		
		mFront = (mFront + 1) % mSize;		

		mCount--;
		return true;
	}
	
	
	// ť�� �����͸� ����Ѵ�.
	public void printCQ()
	{
		
		
	}

}
