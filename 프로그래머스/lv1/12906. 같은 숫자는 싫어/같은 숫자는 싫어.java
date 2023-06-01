import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        int count=1;//answer[] 길이 세려고 선언
        int[] temp = new int[arr.length];
        int j=0;
        
        //중복 숫자 확인해서 거르기
        temp[0]=arr[0];
        for(int i=0;i<arr.length;i++){
            for(;j<arr.length;){
                if(temp[i]!=arr[j]){
                    temp[i+1]=arr[j];
                    count++;
                    break;
                }
                else if(temp[i]==arr[j]) j++;
            }
        }
        
        // answer[]의 길이 정하기
        // for(int i=0;i<arr.length;i++){
        //     if(temp[i]==0 && temp[i+1]==0) {
        //         count=i;
        //         break;
        //     }
        // }
        answer=new int[count];
        
        //answer[]에 값넣기
        for(int i=0;i<count;i++){
            answer[i]=temp[i];
        }
        

        return answer;
    }
}