
public class LottoNumbers {

	public static void main(String[] args) {
		// (����) �ζ� ��ȣ �����ϴ� ���α׷��� ¥�ÿ�. ---------------------------------------------------------------
		
					// 1.������ ���ڸ� ũ�Ⱑ 6�� int�� �迭 �����
						int[] lotto = new int[6];		
				
					// 2.1���� �����ؼ� 45������ ���ڸ� ���Ƿ� �����ϰ� 1�� �迭�� �ֱ� (for���� 6����)
						for(int i=0; i<6; i++)
						{
						lotto[i] = (int)(Math.random()*45)+1;
						
							//�ߺ� ���� ����. -> ���ݻ��� ���ڰ� ������ ���� ���ڵ� �� ���� ���� �ִٸ� i�� ������Ű�� ���� �ٽ� �̴� �˰���
							for(int j=0; j<i; j++) 
							{
								if(lotto[i] == lotto[j]) 
								{
									i--;
									break;
								}
							}
						}
						System.out.print("�ζ� ��ȣ: ");				
					// 3.��ȣ ���	
						for(int i=0; i<6; i++)
						{
							System.out.print(lotto[i] + " ");
						}	

	}

}
