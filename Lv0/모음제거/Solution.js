function solution(my_string) {
    let answer  = '';
    answer = my_string.split("").filter(c => !"aeiou".includes(c)).join("")
    return answer;
}