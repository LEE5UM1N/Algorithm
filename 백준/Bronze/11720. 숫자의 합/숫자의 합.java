import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		char[] c = S.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			sum=sum+c[i]-'0';
		}
		System.out.println(sum);
	}

}
