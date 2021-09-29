import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	
	
    public int[] solution(int[] arr, int divisor) {
        
        
        List<Integer> list = new ArrayList<>();
	    	    
	    for(int i=0; i<arr.length; i++){
	        if(arr[i] % divisor == 0){
	            list.add(arr[i]);
	        }
	    }
	    
	    if(list.isEmpty()) {
	    	list.add(-1);
	    }
	    
	    for(int i=0; i<list.size(); i++){
	        for(int j=i+1; j<list.size(); j++) {	        	
	        	if(list.get(i) > list.get(j)) {
	        		int temp = list.get(i);
	        		list.set(i, list.get(j));
	        		list.set(j, temp);
	        	}	        	
	        }
	    }
	    
	    int answer[] = new int[list.size()];
	    
	    for(int i=0; i<answer.length; i++) {
	    	answer[i] = list.get(i);
	    }      

        return answer;
    }
}