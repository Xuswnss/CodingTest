function solution(array) {
    let answer = 0;
    array.sort((a,b) => a-b);
    const mid = Math.floor(array.length/2);
    answer = array[mid]
    return answer;
}