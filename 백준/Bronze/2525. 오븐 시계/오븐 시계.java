import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //선언
    	int inputhour, inputmin, cookingtime, outputhour, outputmin;
        Scanner scan = new Scanner(System.in);
        
        //입력
        inputhour=scan.nextInt();
        inputmin=scan.nextInt();
        cookingtime=scan.nextInt();
        
        //처리
        outputhour=inputhour+(cookingtime/60);
        outputmin=inputmin+(cookingtime%60);
        if(outputmin>=60) {
        	outputhour=outputhour+1;
        	outputmin=outputmin-60;
        }
        if(outputhour>=24) outputhour=outputhour-24;
        
        //출력
        System.out.print(outputhour);
        System.out.print(" ");
        System.out.print(outputmin);
    }
}