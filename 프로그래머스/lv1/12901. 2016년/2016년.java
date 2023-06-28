class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] months={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weeks={"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int daySum=0;
        
        for(int i=0;i<a-1;i++){
            daySum=daySum+months[i];
        }
        daySum=daySum+b;
        int x = (daySum%7);
        
        if(x==0){
          x=6;   
        }
        else{
          x=x-1; 
        }        
        
        answer=weeks[x];
        
        return answer;
    }
}