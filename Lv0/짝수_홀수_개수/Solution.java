package Lv0.짝수_홀수_개수;

/* 정수가 담긴 리스트 num_list가 주어질 때,
 num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
 return 하도록 solution 함수를 완성해보세요.*/

class Solution {
    public int[] solution(int[] num_list) {
        // int[] answer = {}; answer = {} 는 크기가 0인 배열을 선언하는 코드 이므로 answer[]++
        // 을 실행할때 IndexOutOfBoundsException이 발생한다.
        int[] answer = {0,0};
        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++; // 짝수 개수 증가
            } else {
                answer[1]++; // 홀수 개수 증가
            }
        }
        return answer;
    }
}