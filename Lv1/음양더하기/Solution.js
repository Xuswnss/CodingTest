function solution(absolutes, signs) {
    let answer = 0;
    answer = absolutes.reduce((a,b,i) => a + (signs[i] ? b : -b), 0 )
    return answer;
}