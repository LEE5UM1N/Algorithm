import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		for(int x=0;x<commands.length;x++) {
			int i=commands[x][0];
			int j=commands[x][1];
			int k=commands[x][2];
			
			int[] haha=new int[j-i+1];
			
			for(int y=0;i<j+1;y++) {
				haha[y] = array[i-1];
				i++;
			}
			
			Arrays.sort(haha);
			
			answer[x]=haha[k-1];
        }
            
        return answer;
    }
}