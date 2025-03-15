function solution(a, b) {
    let answer = 0;
    let max = Math.max(a,b)
    let min = Math.min(a,b)
    answer = (max - min -1 )*(max + min) /2
    return answer;
}