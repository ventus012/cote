class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        int give = a; // 상점에 주는병수
        int change = b; // 상점에서 교환해주는 비율
        int have = n; // 가지고 있는 병수
       
        int remain; //상점에 주고 남은 병수
        int get; //상점한테 받는 병수
        
        while(have>=give){
            remain = have % give ;
            get = (have/give)*change;
            have = (remain+get);
            
            answer += get;
        }
        return answer;
    }
}