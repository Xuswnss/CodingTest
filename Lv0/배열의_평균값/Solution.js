/*
* 정수 배열 numbers가 매개변수로 주어집니다.
*  numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
*
* TODO
*  reduce() : 배열의 각 요소를 순회하며 callback함수의 실행 값을 누적하여 하나의 결과 값을 반환한다.
*   1. accumulator : 반환 값 누적
*   2. currentValuer : 배열의 현재 요소
*   3. index(Optional) : 배열의 현재 요소의 인덱스
*   4. array(Optional) : 호출한 배열
*  - initialValue(Optional) : 최초 callback 함수 실행 시 accumulator 인수에 제공되는 값, 초기값을 제공하지 않을
*                   경우 배열의 첫번째 요소를 사용하고, 빈 배열에서 초기값이 없을 경우 에러 발생 */

// #1. reduce 사용
function reduce (numbers){
    let answer = numbers.reduce((a,b) => a+b , 0) / numbers.length;
    return answer;
}// end reduce

// #2. for..of 사용
/*TODO
*  for.. of 와 forEach
*   1. forEach
*       배열의 요소마다 콜백함수가 실행됨 -> 성능이 떨어진다.
*       return을 써도 무시된다 (반환값이 존재하지 않는다)
*       break, continue 사용불가
*   2. for...of
*       배열, 문자열, Map, Set 같은 반복 가능한 객체에서 사용 가능하다
*       break, continue, return 이 사용가능하다
*       비동기 코드 (async / await ) 와 함께 사용가능하다
*       실무에서는 forEach보다 for...of가 더 직관적이고 빠른 기능을 제공하므로 for...of를 선호한다.*/

2
3
4
5
6
7
8
9
function solution(numbers) {
    var answer = 0;
    for(i of numbers) {
        answer += i
    }
    return answer / numbers.length;

} //end Solution