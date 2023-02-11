package generalDSA;

public class BarChart
{
	
	public static void cross()
	{
		int n = 9;
		// cross architecture
//*							*		
//		*				*			
//			*		*				
//				*					
//			*		*				
//		*				*			
//*							*		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (i == j || i + j == n - 1)
				{
					System.out.print("*\t");
				} else
					System.out.print("\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		//cross();
		diamond();
	}
	 public static void diamond()
	 {
		 int n= 7;
		 int os = n/2;//3
		 int is = -1;
		 
		 for(int i =0;i<n;i++)
		 {
//			 System.out.println(os+","+is);
			 for(int j=0;j<os;j++)
				 System.out.print("\t");
			 for(int j=0;j<is;j++)
				 System.out.print("*\t");
			 System.out.println();
			 if(i<=n/2)
			 {
				 os--;
				 is+=2;
			 }
			 else
			 {
				 os++;
				 is-=2; 
			 }
		 }
	 }
	
}
//3,-1
//2,1
//1,3
//0,5
//-1,7
//0,5
//1,3
				