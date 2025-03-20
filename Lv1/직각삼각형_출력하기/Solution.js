/*
* EventEmitter -> 기본 개념
* Node.js의 event모듈에 포함되어 있음.
* 이를 사용하면 이벤트를 생성하고 핸들러를 등록하여 실행할 수 있습니다.
* on(event, callback) -> 특정 이벤트 발생 시 실행할 리스너 등록
* emit(event, [args]) -> 이벤트 발생
* once(event, callback) -> 한 번만 실행되는 이벤트 리스너 등록
* removeListener(event, callback) -> 특정 리스너 제거
* removeAllListeners(event) -> 특정 이벤트의 모든 리스너 제거
*/

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function (line) {
    let n = Number(line); // 입력값을 숫자로 변환

    for (let i = 1; i <= n; i++) { // i는 1부터 n까지 증가
        console.log('*'.repeat(i)); // i개의 '*' 출력
    }

    rl.close(); // 입력 종료
});
