import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	String s="";
    	int n=0;
    	
    	s=scan.nextLine();
    	n=scan.nextInt();
    	char c=s.charAt(n-1);
    	
    	System.out.println(c);
    	
    }
}
