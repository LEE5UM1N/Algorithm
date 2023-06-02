class Solution {
    public String solution(String s) {
        String answer = "";
        String lala="";
        String[] temp={};
        String[] lalaTemp={};
        
        temp=s.split(" ", -1);
        
        for(int i=0;i<temp.length;i++){
            lala=temp[i];
            lalaTemp=lala.split("");
            for(int j=0;j<lalaTemp.length;j++){
                if(j==0||j%2==0){
                    answer=answer+lalaTemp[j].toUpperCase();
                }
                else{
                    answer=answer+lalaTemp[j].toLowerCase();
                }
            }
            if(i<temp.length-1) answer=answer+" ";
        }
        return answer;
    }
}