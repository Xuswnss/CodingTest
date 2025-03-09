package Lv0.삼각형의완성조건1;

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides); // sides의 배열을 오름차순 정렬
        // 가장 긴 변의 길이가 다른 두 변의 합보다 작은지 확인
        if(sides[0] + sides[1] > sides[2]){
            answer = 1;
        }else{
            answer = 2;
        }


        return answer;
    }
}