import java.util.Scanner;
 
public class Pattern8
{
 public static void main(String args[])
 {
 int i,j,n,k;
 Scanner sc = new Scanner(System.in);
     System.out.print("Enter No of Lines : ");
 n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
 k=i;
         for(j=1;j<=i;j++,k++)
         { 
             System.out.print((char)(k+64));
         } 
         System.out.println("");
     }
 }
}