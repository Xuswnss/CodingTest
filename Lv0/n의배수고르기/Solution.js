function solution(n, numlist) {
    let answer = [];
    answer = numlist.filter(num => num % n === 0)
    return answer;
}