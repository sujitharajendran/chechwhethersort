package capgi;
import java.util.*;
public class Arrasysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int u=0;
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		b[u]=a[i];
		u++;
		}
		Arrays.sort(b);
		for(int i=0;i<n;i++) {
			if(b[i]==a[i]) {
		count++;
			}
			
		}
		if(count==n) {
			System.out.println("sorted");
		}
			else {
				System.out.println("not sorted");
			}
		}
		
		}
	


