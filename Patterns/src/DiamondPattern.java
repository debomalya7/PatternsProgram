
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9,sp=n/2,ele=1;
		
		for(int i=1; i<=n; i++) 
		{
			for(int j=1; j<=sp ; j++)
				System.out.print("  ");
			int k=ele/2 + 1;
			
			for(int j=1 ; j<=ele ; j++)
			{
				System.out.print(k+" ");
				if(j<=ele/2)
					k--;
				else
					k++;
			}
			if(i<=n/2)
			{
				sp--;
				ele=ele+2;
			}
			else
			{
				sp++;
				ele=ele-2;
			}
			System.out.println();
			
		}

	}

}
