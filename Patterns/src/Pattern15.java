
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1 ; i<=n ;i++)
		{
			int k=i;
			for(int j=1 ;j<=i; j++)
			{
				System.out.print(k+" ");
				k=k+n-j;
			}
			System.out.println();
		}

	}

}
