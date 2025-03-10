package Lv0.배열원소의길이;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; // 주어진 문자열 배열의 길이 만큼 정수배열을 생성한다.

        // 각 문자의 길이를 계산해서 answer 에 저장한다
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}