function solution(left, right) {
    let answer = 0;

    for (let i = left; i <= right; i++) {
        // 제곱수인지 확인
        if (Math.sqrt(i) === Math.floor(Math.sqrt(i))) {
            answer -= i; // 제곱수이면 빼기
        } else {
            answer += i; // 제곱수가 아니면 더하기
        }
    }

    return answer;
}