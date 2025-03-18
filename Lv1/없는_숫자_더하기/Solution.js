function solution(numbers) {
    let answer = -1;
    let sumAll = 45;
    let sumNumbers = numbers.reduce((a,b) => a + b , 0)
    answer = sumAll - sumNumbers;
    return answer;
}