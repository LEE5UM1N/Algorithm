class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp=0;
        int[] arr=new int[d.length];
        int sum=0;
        
        arr=d;
        
 		for(int i=0;i<d.length;i++) {
			for(int j=i+1;j<d.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
        
        for(int i=0;i<d.length && sum+arr[i]<=budget;i++){
            sum=sum+arr[i];
            answer++;
        }
        
        return answer;
    }
}