import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr1 = s.split(" ");
        int[] arr2 = new int[arr1.length];
        
        for(int i=0; i<arr1.length; i++) {
        	arr2[i] = Integer.parseInt(arr1[i]);
        }
        
        Arrays.sort(arr2);
        
        answer += arr2[0] + " " + arr2[arr2.length-1];
        
        return answer;
    }
}