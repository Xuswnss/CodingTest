package Lv0.두수의_차;
/*
* 정수 num1과 num2가 주어질 때,
*  num1에서 num2를 뺀 값을 return하도록
* soltuion 함수를 완성해주세요.*/
public class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4, 2));
    }

}// end Solution
