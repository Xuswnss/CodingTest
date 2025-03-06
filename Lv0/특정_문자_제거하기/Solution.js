function solution(my_string, letter) {
    let answer = '';
    answer = my_string.replaceAll(letter, "")
    return answer;
}