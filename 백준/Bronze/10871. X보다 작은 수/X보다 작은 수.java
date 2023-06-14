import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int N=scan.nextInt();
    	int X=scan.nextInt();
    	int[] A=new int[N];
    	
    	ArrayList<String> lili = new ArrayList<String>();
    	
    	for(int i=0;i<N;i++) {
    		A[i]=scan.nextInt();
    	}
    	
    	for(int i=0;i<N;i++) {
    		if(A[i]<X) {
    			String sumString = Integer.toString(A[i]);
    			lili.add(sumString);
    		}
    	}
    	
    	for(int i=0;i<lili.size();i++) {
    		System.out.print(lili.get(i));
    		if(i<lili.size()-1) {
    			System.out.print(" ");
    		}
    	}
    	
    }
}