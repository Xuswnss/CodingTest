function solution(array, n) {
    let answer = 0;
    answer = array.filter(num => num === n).length;
    return answer;
}