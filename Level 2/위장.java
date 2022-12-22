import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> closet = new HashMap();
        
        for(int i=0; i<clothes.length; i++){
            if(closet.containsKey(clothes[i][1])){
                closet.put(clothes[i][1], closet.get(clothes[i][1]) + 1);
            }else{
                closet.put(clothes[i][1], 1);
            }
        }
        
        for(String name : closet.keySet()){
            answer *= (closet.get(name) + 1);
        }
        
        answer -= 1;
        
        return answer;
    }
}