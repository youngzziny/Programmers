import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int myPrint = priorities[location]; // 내가 요청한 문서의 중요도
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            queue.add(priorities[i]);
        }
        
        int highest = 9; // 현재 최고 중요도
        
        while(true){            
            while(!queue.contains(highest)){ // 최고 중요도를 queue에 맞게 낮춰줌
                highest--;
            }
            
            if(location == 0){ // 내가 요청한 문서의 차례가 왔을때
                if(myPrint == highest){ // 내가 요청한 문서가 현재 최고 중요도일때
                    answer++;
                    return answer;
                }else{ // 내가 요청한 문서가 현재 최고 중요도가 아닐때
                    queue.add(queue.peek());
                    queue.remove();
                    location = queue.size() - 1;
                }
            }else{ // 내가 요청하지 않은 문서의 차례일때     
                if(queue.peek() == highest){ // 해당 문서가 최고 중요도일때
                    queue.remove();
                    answer++;
                    location--;
                }else{ // 해당 문서가 최고 중요도가 아닐때
                    queue.add(queue.peek());
                    queue.remove();
                    location--;
                }
            }
        }       
    }
}