package Lv1.평균구하기;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            answer += arr[i];
//            answer = answer / arr.length;
//        }
        for(int num : arr) {
            answer += num;

        }
        answer = answer / arr.length;
        return answer;
    }
}