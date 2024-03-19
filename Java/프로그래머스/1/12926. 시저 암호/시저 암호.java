import java.util.*;

class Solution {
    public String solution(String s, int n) {
        
         String answer = "";
        
        char[] charArr = s.toCharArray();
        
        
        for(int i=0; i<charArr.length; i++){
            if(65<=charArr[i] && charArr[i]<=90){
                if(charArr[i]+n <= 90){
                    answer += Character.toString(charArr[i]+n);
                }else{
                    answer += Character.toString(charArr[i]+n-26);
                }
            }else if(97<=charArr[i] && charArr[i]<=122){
                if(charArr[i]+n <= 122){
                    answer += Character.toString(charArr[i]+n);
                }else{
                    answer += Character.toString(charArr[i]+n-26);
                }
            } else {
                answer += " ";
            }
        }
        
            
        
       
        
        return answer;
    }
}