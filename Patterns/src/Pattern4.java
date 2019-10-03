import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<i+2;k++) {
				System.out.print(k%2 + " ");
			}
			System.out.println("");
		}

	}

}
