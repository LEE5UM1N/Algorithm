import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int n=scan.nextInt();
    	int haha[]=new int[n];
    	
    	for(int i=0;i<n;i++) {
    		haha[i]=scan.nextInt();
    	}
    	
    	int max=haha[0];
    	int min=haha[0];
    	
    	//최솟값 최댓값 추출
    	for(int i=1;i<n;i++) {
    		if(max<haha[i]) max=haha[i];
    		if(min>haha[i]) min=haha[i];
    	}
    	
    	System.out.print(min+" "+max);
    }
}