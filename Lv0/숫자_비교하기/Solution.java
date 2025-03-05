package Lv0.숫자_비교하기;
/*
* 정수 num1과 num2가 매개변수로 주어집니다.
* 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.*/
public class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (num1 == num2) ? 1 : -1;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(11, 11));
    }

}// end Solution
