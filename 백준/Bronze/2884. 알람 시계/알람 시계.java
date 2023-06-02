import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int H;
        int M;
        int newH = 0;
        int newM = 0;
        int temp;
        
        Scanner scan=new Scanner(System.in);
        
        H=scan.nextInt();
        M=scan.nextInt();
        
        if(M>=45){
            newM=M-45;
            newH=H;
        }
        else if(M<45){
            temp=45-M;
            newM=60-temp;
            newH=H-1;
            if(H==0){
                newH=23;
            }
        }
        
        System.out.println(newH + " " + newM);
    }
}