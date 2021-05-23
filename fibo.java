public static boolean fibo(int n)
	{	
		if (n < 3)
		{
			return false;			
		}
		
		int[] arFibo= new int[n];
		
		arFibo[0] = 1;
		arFibo[1] = 1;
				
		for (int i = 2; i < n; i++)
			arFibo[i] = arFibo[i - 1] + arFibo[i - 2];
						
		
		for (int i = 0; i < n; i++)
			System.out.print(arFibo[i] + " ");
			
		return true;
	}
