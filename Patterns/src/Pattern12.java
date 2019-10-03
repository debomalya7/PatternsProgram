import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=n-i;k++) {
				System.out.print(k%2 + " ");
			}
			System.out.println("");
		}

	}

}
