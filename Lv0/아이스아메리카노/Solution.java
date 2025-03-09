package Lv0.아이스아메리카노;

class Solution {
    public int[] solution(int money) {
        int[] answer = {0,0};
        int price = 5500;
        int cups = money / price;
        int remainingMoney = money % price;
        answer[0] = cups;
        answer[1] = remainingMoney;


        return answer;
    }
}