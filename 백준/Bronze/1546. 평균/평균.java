import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int max=0;
		int sum=0;
		
		for(int i=0;i<M;i++) {
			int temp=scan.nextInt();
			if(max<temp) max=temp;
			sum=sum+temp;
		}
		
		System.out.println(sum*100.0/max/M);
	}
}