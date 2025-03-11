function solution(n) {
    let answer = 0;
    let sqrt = Number.isInteger(Math.sqrt(n))
    if(sqrt){
        answer = 1;
    }else{
        answer = 2;
    }
    return answer;
}

// Math.sqrt(n) -> n의 제곱근을 구한다
//Number.isInteger() -> 결과가 정수인지 아닌지 확인한다.