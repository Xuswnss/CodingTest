package Lv0.배열의_평균값;
/*
 * 정수 배열 numbers가 매개변수로 주어집니다.
 *  numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.*/
public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
        }
        answer = sum / numbers.length;

        return answer;
    }

    public static void main(String[] args) {
         Solution solution = new Solution();
         System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
