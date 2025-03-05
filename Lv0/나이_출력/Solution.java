package Lv0.나이_출력;

/*
* 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
*  2022년 기준 선생님의 나이 age가 주어질 때,
*  선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요*/

class Solution {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(18));
        System.out.println(solution.solution(19));
    }
}