function solution(n, t) {
    let answer = 0;
    answer = n << t;
    // 비트 연산은 제곱만 가능
    return answer;
}

function solution2(n, t){
    let answer = 0;
    answer = Math.pow(2,t) * n;
    return answer ;
}