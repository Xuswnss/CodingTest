function solution(array, height) {
    let answer = 0;
    answer = array.filter(h => h>height).length;
    return answer;
}