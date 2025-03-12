function solution(n) {
    let sum = 0;
    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            sum += i; // 약수 추가
        }
    }
    return sum;
}