function solution(n) {
    for (let x = 2; x < n; x++) { // x는 2부터 시작 (1 제외)
        if (n % x === 1) { // n을 x로 나눈 나머지가 1인지 확인
            return x; // 가장 작은 x 반환
        }
    }
    return -1; // 항상 해가 존재하므로 실행되지 않음
}