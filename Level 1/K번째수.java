import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int answer[] = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			
			int d =	b-a+1; // 자른 배열길이
			int temp[] = new int[d]; // 자른 배열 넣어주기
			
			for(int j=0; j<d; j++) {
				temp[j] = array[(a-1)+j];
			}
			Arrays.sort(temp);
		//	System.out.println(Arrays.toString(temp));
		
			answer[i] = temp[c-1];
		}
        
        return answer;
    }
}