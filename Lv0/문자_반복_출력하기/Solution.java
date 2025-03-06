package Lv0.문자_반복_출력하기;
/*스트링을 배열로 만들어서 쪼개기 각각의 인덱스를 순회하면서 3번 씩  반복 다시 string으로 만들기*/
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder(); // String 대신 StringBuilder 사용

        String[] temp = my_string.split(""); // 문자열을 한 글자씩 쪼갬 -> 배열로 만들기
        for (String s : temp) {
            answer.append(s.repeat(n)); // 각각의 인덱스를 순회하면서 n번씩 반복
        }

        return answer.toString(); // 다시 스트링으로 변경
    }

}

/*
* String (Immutable, 불변)
* string은 불변 객체이다
* 문자열이 수정될 떄 기존 문자열을 변경하는 것이 아니라 새로운 문자열 객체를 생성 따라서 문자열을 자주 변경하면 메모리
* 낭비와 성능저하가 발생할 수 있음
*
* StringBuilder (가변, mutable)
* 문자열을 변경해도 새로운 객체를 생성하지 않고 기존 객체를 수정한다. 따라서 문자열을 자주 변경할 떄 성능이 좋다
*
* append() -
* StringBuilde, StringBuffer 에서 제공되며 기존 문자열 끝에 새로운 문자열을 추가하는 메서드이다.
* + 연산자를 사용해서 생성하면 새로운 string 객체가 생성이 된다 -> 메모리 낭비!!*/