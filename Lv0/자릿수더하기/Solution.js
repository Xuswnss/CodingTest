function solution(n) {
    let answer = 0;
    answer = String(n) //n을 문자열로 변환
        .split('') // 각 문자로 나누어 배열전환
        .map(Number) // 각 문자를 숫자로 변환
        .reduce((a,b) => a+b,0) //배열의 숫자들을 합산.
    return answer;
}