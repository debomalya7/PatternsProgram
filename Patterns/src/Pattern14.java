import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i+1;k++) {
				System.out.print(c%2 + " ");
				c++;
			}
			System.out.println("");
		}

	}

}
