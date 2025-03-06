function solution(n) {
     let answer = 0;
     for(let i = 1 ; i <= n ; i++){
         if(i % 2 == 0 ){
             answer += i;
         }
     }

    return answer;
}


//
// *  수열 공식을 사용한 풀이
// *   Math.floor() 은 소숫점을 버리고 만약 소수가 나오면 그 보다 작거나 같은 값을 리턴한다.
// *  ** 등차수열의 짝수의 합 공식
// *  S = 2 * ( k(k+1) / 2) = k(k+1) */
// function solution2(n) {
//     var half = Math.floor(n/2); // n의 짝수 개수를 의미한다.
//     return half*(half+1);
// }
