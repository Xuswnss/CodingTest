function solution(n) {
    let answer = 0;
    answer = parseInt(n.toString().split("").sort((a,b) => b - a ).join(''),10)

    return answer;
}