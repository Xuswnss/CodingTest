function solution(n) {
    let answer = '';
    answer = "수박".repeat((n+1) / 2).substring(0, n);
    // 충분한 길이를 확복 repeat( n + 1 )/ 2
    return answer;
}