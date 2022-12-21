class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase(); // 전부 소문자로 치환
        
        for(int i=0; i<s.length(); i++){
            if(i == 0){ // 문장의 첫글자는 무조건 대문자로 치환
                answer += Character.toString(s.charAt(i)).toUpperCase();
            }else if(Character.toString(s.charAt(i)).equals(" ")){ // 공백은 그대로 공백으로 치환
                answer += " ";
            }else if(Character.toString(s.charAt(i-1)).equals(" ")){ // 바로 전글자가 공백이었을 경우 대문자로 치환
                answer += Character.toString(s.charAt(i)).toUpperCase();
            }else{ // 그외 문자는 그대로 입력
                answer += Character.toString(s.charAt(i));
            }
        }       
        
        return answer;
    }
}