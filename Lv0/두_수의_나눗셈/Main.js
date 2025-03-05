/*
* 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에
*  1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.
*
* TODO
*  Math.trunc()와 Math.floor()의 비교
*  공통점 : 숫자의 소숫점 이하를 버린다
*  차이점 : 두 함수의 동작 방식이다르다
*   1. trunc : 소숫점 이하를 단순히 자른다
*   2. floor : 주어진 숫자보다 작거나 같은 가장 큰 정수를 반환한다
*       ex )  Math.floor(3.14) = 3
*             Math.floor(-3.14) = -4
*   단순히 정수 부분만 필요할 경우에는 floor보다 trunc를 쓰자. */

function solution(num1, num2) {
    let answer = 0;
    answer = Math.trunc((num1 / num2 ) * 1000)
    return answer;
}


