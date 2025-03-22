package Lv1.부족한_금액_계산하기;



class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        // count 수 만큼 money를 곱한다. (반복문을 돌면서)
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if(sum >= money){
            answer = sum - money;
        }else{
            answer = 0;
        }


        return answer;
    }
}
