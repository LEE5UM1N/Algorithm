import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=1; i<n+1; i++) {
			for(int x=i;n-x>0;x++) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
