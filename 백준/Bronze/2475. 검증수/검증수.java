import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	int a, b, c, d, e, f;
    	int answer=0;
    	
    	Scanner scan = new Scanner(System.in);
    	
    	a=scan.nextInt();
    	b=scan.nextInt();
    	c=scan.nextInt();
    	d=scan.nextInt();
    	e=scan.nextInt();

    	a=a*a;
    	b=b*b;
    	c=c*c;
    	d=d*d;
    	e=e*e;
    	
    	answer=(a+b+c+d+e)%10;
    	System.out.println(answer);

    }
}