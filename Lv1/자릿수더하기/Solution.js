function solution(n)
{
    let answer = 0;

    answer = String(n) // 숫자 -> 문자열
        .split('') // -> 문자열 -> 문자열 배열
        .map(Number) // 문자열 배열 -> 숫자
        .reduce((a,b) => a + b); // 배열의 모든 숫자 더하기



    return answer;
}