import java.util.;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = ;
    	
        MapString,Integer list = new HashMap();
        
        for(int i=0; iparticipant.length; i++){
            if(list.containsKey(participant[i])){
                list.put(participant[i], list.get(participant[i]) + 1);
            }else{
                list.put(participant[i], 1);
            }
        }
        
        for(int i=0; icompletion.length; i++){
            list.put(completion[i], list.get(completion[i]) - 1);
        }
        
        for(String name  list.keySet()){ 저장된 key값 확인
            if(list.get(name) != 0)
                answer = name;
        }
        
        return answer;
    }
}