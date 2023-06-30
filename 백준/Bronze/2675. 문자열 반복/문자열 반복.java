import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		int[] R = new int[T];
		String[] S = new String[T];
		
		for(int i=0;i<T;i++) {
			R[i]=scan.nextInt();
			S[i]=scan.nextLine();
		}
		
		
		for(int i=0;i<T;i++) {
			String[] haha=S[i].split("");
			for(int j=1;j<haha.length;j++) {
				for(int k=0;k<R[i];k++) {
					System.out.print(haha[j]);
				}
			}
			System.out.println();
		}
		
	}
	
}