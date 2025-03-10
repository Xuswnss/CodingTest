function solution(n) {
    let answer = 0;
    answer = Math.ceil(n/7);
    return answer;
}

/*
* Math.ceil()은 올림 연산을 수행하는 자바스크립트 내장 함수이다. ㅈ
* 즉, 소수점이 존재하면 무조건 다음 정수로 올려준다.
*
*
* 🚀 Math.ceil() vs Math.floor() vs Math.round() 차이
함수	설명	예제 (3.7)	예제 (-3.7)
Math.ceil(x)	올림 (무조건 큰 정수)	4	-3
Math.floor(x)	내림 (무조건 작은 정수)	3	-4
Math.round(x)	반올림 (0.5 이상 올림)	4	-4
✔ 올림할 땐 Math.ceil(), 내림할 땐 Math.floor(), 반올림할 땐 Math.round() 사용! 🚀
*
* */