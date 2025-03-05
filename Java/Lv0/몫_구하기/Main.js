/*
* 정수 num1, num2가 매개변수로 주어질 때,
*  num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
* */
/*TODO
*  Math.floor() : 소숫점 이하를 버린다. */
function solution(num1, num2) {
    let answer = 0;
    answer= Math.floor(num1 / num2 );

    return answer;
}

console.log("몫",solution(4,4))