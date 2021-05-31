
public class Node 
{
	static int NodeCount;		// ����� ����
	
	private int mID;			// ID
	private String mData;		// ������ ������
	
	private Node mNext;			// ��������� �������� �����ϴ� ��������
	
		
	Node()
	{
		mID = 1000 + NodeCount;
		mData = "nodata";
		mNext = null;
		
		NodeCount++;		
	}

	// ���̵� �����ϴ� �޼ҵ�
	public int getID()
	{
		return mID;
		
	}

	// �����͸� �����ϴ� �޼ҵ�
	public String getData()
	{
		return mData;
	}
	
	// ���� ����� �������� �����ϴ� �޼ҵ�
	public Node getNextNode()
	{
		return mNext;
	}
	
	// ������带 �������ִ� �޼ҵ�
	public void setNextNode(Node node)
	{
		mNext = node;
	
	}
	
}



/* ��� Ŭ���� ���� �ڵ�
 
public static void main(String[] args) 
{
	// 10���� ��带 �����.
	// ù��° ���� ��� ���������� �����Ѵ�.
	// id�� ����Ʈ �غ���.!
	
	Node new_node = null;
	Node header_node = null;
	
	Node current_node = null;
	
	for(int i = 0; i < 10; i++)
	{
		// 1. ��带 �Ҵ��Ѵ�.
		new_node = new Node();
		
		// 2. ���� ù����� ������������� �����Ѵ�.
		if (i == 0)
			header_node = new_node;
		else
			current_node.setNextNode(new_node);
					
		current_node = new_node;

	}
	
	for(int i = 0; i < 10; i++)
	{
		if (i == 0)
		{
			current_node = header_node;
		}
		else
		{
			current_node = current_node.getNextNode();
			
		}
		
		System.out.println(current_node.getID());			
	}	
}

 */