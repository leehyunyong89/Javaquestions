
public class Node 
{
	static int NodeCount;		// 노드의 개수
	
	private int mID;			// ID
	private String mData;		// 구색용 데이터
	
	private Node mNext;			// 다음노드의 참조값를 저장하는 참조변수
	
		
	Node()
	{
		mID = 1000 + NodeCount;
		mData = "nodata";
		mNext = null;
		
		NodeCount++;		
	}

	// 아이디를 리턴하는 메소드
	public int getID()
	{
		return mID;
		
	}

	// 데이터를 리턴하는 메소드
	public String getData()
	{
		return mData;
	}
	
	// 다음 노드의 참조값을 리턴하는 메소드
	public Node getNextNode()
	{
		return mNext;
	}
	
	// 다음노드를 세팅해주는 메소드
	public void setNextNode(Node node)
	{
		mNext = node;
	
	}
	
}



/* 노드 클래스 실행 코드
 
public static void main(String[] args) 
{
	// 10개의 노드를 만든다.
	// 첫번째 노드는 헤더 참조변수에 저장한다.
	// id를 프린트 해보자.!
	
	Node new_node = null;
	Node header_node = null;
	
	Node current_node = null;
	
	for(int i = 0; i < 10; i++)
	{
		// 1. 노드를 할당한다.
		new_node = new Node();
		
		// 2. 만약 첫노드라면 헤더참조변수에 저장한다.
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