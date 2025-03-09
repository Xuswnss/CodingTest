function solution(dot) {
    const [num, num2] = dot;  // dot 배열에서 x좌표(num)와 y좌표(num2)를 추출
    const check = num * num2 > 0; // num과 num2가 모두 양수 또는 모두 음수인지 체크 (사분면 판별에 사용)

    return num > 0 ? (check ? 1 : 4) : (check ? 3 : 2);  // x좌표(num)에 따라 사분면 결정
}
