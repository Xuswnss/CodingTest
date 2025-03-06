function solution(my_string, n) {
    let answer = '';
    answer = [...my_string].map(i => i.repeat(n)).join("")
    return answer;
}