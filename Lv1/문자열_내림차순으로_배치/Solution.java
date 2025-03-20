package Lv1.문자열_내림차순으로_배치;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 1. 문자열 -> 문자 배열 반환
        Character[] arr = new Character[s.length()];
        for(int i = 0; i < s.length() ; i++){
            arr[i] = s.charAt(i);
        }
        // 2. 배열 정렬( 내림차순 )
        Arrays.sort(arr, Collections.reverseOrder());

        // 3. 문자열로 반환
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            sb.append(c);
        }

        answer = sb.toString();

        return answer;
    }
}