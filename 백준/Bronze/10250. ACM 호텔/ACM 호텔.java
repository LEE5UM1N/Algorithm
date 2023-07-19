import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		int[] H=new int[T];
		int[] W=new int[T];
		int[] N=new int[T];

		for(int i=0;i<T;i++) {
			H[i]=scan.nextInt();
			W[i]=scan.nextInt();
			N[i]=scan.nextInt();
		}
		
		for(int i=0;i<T;i++) {
			if(N[i]<=H[i]) System.out.println(N[i]+"01");
			else {
				int YY=N[i]%H[i];
				int XX=(N[i]/H[i]);
				if(YY!=0) {
					System.out.print(YY);
					XX++;
				}
				else System.out.print(H[i]);
				if(XX<10) System.out.println("0"+XX);
				else System.out.println(XX);
			}
		}
	}

}
