function solution(numbers) {
    let answer = 0;
    numbers.sort((a, b) => a - b ) // 오름차순 정렬
    let n = numbers.length;
    answer = numbers[n-1] *numbers[n-2];
    return answer;
}