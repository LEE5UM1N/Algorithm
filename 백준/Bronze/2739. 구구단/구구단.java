import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	int n=0;
    	int multiply=0;
    	Scanner scan = new Scanner(System.in);
    	
    	n=scan.nextInt();
    	
    	for(int i=1;i<10;i++) {
    		multiply=n*i;
    		System.out.printf("%d * %d = %d\n", n, i, multiply);
    	}
    }
}