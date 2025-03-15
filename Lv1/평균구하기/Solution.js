function solution(arr) {
    let answer = 0;
    answer = arr.reduce((a,b) => a + b , 0 )/ arr.length;
    return answer;
}