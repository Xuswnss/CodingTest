function solution(arr) {
    // 배열의 길이가 1이면 [-1] 반환
    if (arr.length === 1) return [-1];

    // 가장 작은 값 찾기
    let min = Math.min(...arr);

    // 가장 작은 값을 제외한 배열 생성
    return arr.filter(num => num !== min);
}