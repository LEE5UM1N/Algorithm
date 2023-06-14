import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int sum=0;
    	
    	int n=scan.nextInt();scan.nextLine();
    	String s=scan.nextLine();
    	
    	int[] z=Stream.of(s.split("")).mapToInt(Integer::parseInt).toArray();
    	
    	for(int i=0;i<z.length;i++) {
    		sum=sum+z[i];
    	}
    	
    	System.out.println(sum);
    	
    }
}