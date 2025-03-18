package Lv1.음양더하기;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {

            int value = signs[i] ? absolutes[i] : -absolutes[i];
            answer += value;

        }

        return answer;
    }
}