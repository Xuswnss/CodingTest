package Lv1.콜라츠_추축;

class Solution {
    public int solution(int num) {
        int count = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            count++;  // 반복 횟수 증가

            if (count >= 400) { // 500번 이상 반복하면 -1 반환
                return -1;
            }
        }

        return count;
    }}