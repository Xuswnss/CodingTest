package Lv0.자릿수더하기;

class Solution {
    public int solution(int n) {
        int answer = 0;

        // int n을 문자열로 변환 -> 배열로 만들기 위해서
        String s = String.valueOf(n);

        // 각 자리 숫자를 더함
        for(char digit : s.toCharArray()) {
            answer += Character.getNumericValue(digit);
        }

        return answer;
    }
}

/* toCharArray()
*   Java에서 문자열 객체를 문자형 배열로 변환하는데 사용한다 반환타입은 char[] 이다.
*
* Character.getNumericValue(digit)
*   주머진 문자를 숫자로 변환한다.
* */