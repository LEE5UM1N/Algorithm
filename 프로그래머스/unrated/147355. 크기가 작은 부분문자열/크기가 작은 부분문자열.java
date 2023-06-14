class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int x=t.length();
		int n=p.length();
		String[] s=new String[x-n+1];
		
		for(int i=0;i<s.length;i++) {
			s[i]=t.substring(i,i+n);
			
			if(Long.parseLong(s[i])<=Long.parseLong(p)) answer++;
		}
        
        return answer;
    }
}