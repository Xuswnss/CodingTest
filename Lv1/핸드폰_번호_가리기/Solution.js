function solution(phone_number) {

    let answer = '';

    let length = phone_number.length;

    //length - 4 까지 "*"로 치환한다
    let hiddenPart = "*".repeat(length -4);

    let visiblePart = phone_number.slice(-4); // 마지막 4자리 추출
    // -n은 문자열의 끝에서 n번째 문자부터 시작한다는 의미입니다.

    answer = hiddenPart + visiblePart;


    return answer;
}