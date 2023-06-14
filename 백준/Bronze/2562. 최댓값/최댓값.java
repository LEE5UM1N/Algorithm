import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[] n = new int[9];
    	
    	for(int i=0;i<9;i++) {
    		n[i]=scan.nextInt();
    	}
    	
		int max=n[0];
    	for(int i=1;i<9;i++) {
    		if(max<n[i]) max=n[i];
    	}
    	
    	for(int i=0;i<9;i++) {
    		if(max==n[i]) {
    			System.out.println(n[i]);
    			System.out.println(i+1);
    		}
    	}
    	
    }
}