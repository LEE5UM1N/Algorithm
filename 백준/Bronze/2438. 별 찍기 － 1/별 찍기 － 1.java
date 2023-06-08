import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int x;
        String y="";
        Scanner scan=new Scanner(System.in);
        
        x=scan.nextInt();
        
        for(int i=0;i<x;i++){
            y=y+"*";
            System.out.println(y);
        }
    }
}