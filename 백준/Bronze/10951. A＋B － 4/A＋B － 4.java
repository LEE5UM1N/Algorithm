import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	ArrayList<String> lili = new ArrayList<String>();
    	
    	int A=0;
    	int B=0;
    	int sum=0;
    	
    	while(scan.hasNext()) {
    		A=scan.nextInt();
			B=scan.nextInt();

			sum=A+B;
			
			String sumString=Integer.toString(sum);
			lili.add(sumString);    
			
    	}
    	int n=lili.size();
    	for(int i=0;i<n;i++) {
    		System.out.println(lili.get(i));
    	}
		
    	
    }
}