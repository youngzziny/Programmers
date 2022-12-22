import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int mine = nums.length / 2; // 내가 가질수 있는 폰켓몬 마리수
        
        HashSet<Integer> hong = new HashSet<>(); // 홍박사가 가진 폰켓몬의 종류
        
        for(int i : nums){
            hong.add(i);
        }
        
        if(hong.size() >= mine){ // 홍박사가 가진 폰켓몬 종류가 내가 가질 수 있는 것보다 더 많다면
            answer = mine;
        }else{
            answer = hong.size(); // 홍박사가 가진 종류가 더 적다면
        }
        
        return answer;
    }
}