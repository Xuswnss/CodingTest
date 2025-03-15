function solution(x, n) {
    let answer = [];
    answer = [...Array(n)].map((_, i ) => x * (i + 1));
    return answer;
}