import java.util.*;
    
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int proNum = progresses.length; 
        int proNow = 0;
        int count = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        boolean isDone = false;
        
        while(!isDone){
            
            for(int i=0; i<proNum; i++){
               progresses[i] += speeds[i];
            }
            
            for(int j=proNow; j<proNum; j++){
                if(progresses[j] >= 100){
                    count++;
                }else{
                    proNow = j;
                    break;
                }
            }
            
            if(count != 0){
                list.add(count);
                count = 0;
            }
            
            isDone = true;
            for(int i=0; i<proNum; i++){
                if(progresses[i] < 100){
                    isDone = false;
                }
            }            
        }        
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}