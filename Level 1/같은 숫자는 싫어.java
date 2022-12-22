import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                queue.add(arr[i]);
            }else if(arr[i] != arr[i-1]){
                queue.add(arr[i]);
            }           
        }
        
        // System.out.println(queue);
        
        int[] answer = new int[queue.size()];

        for(int i=0; i<answer.length; i++){ // i<queue.size()가 불가능한 이유 = queue 크기가 점점 줄어들고 있어서
            answer[i] = queue.poll();
        }
        
        // System.out.println(queue);

        return answer;
    }
}