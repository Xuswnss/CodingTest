function solution(n) {
    let answer = [];
    answer = String(n)// 숫자 -> 문자
        .split('') // 숫자열 배열
        .reverse() // 배열 뒤집기
        .map(Number) // 문자 -> 숫자
    return answer;
}