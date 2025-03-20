function solution(s) {
    let answer = '';
    const sLength = s.length;
    const sMid = sLength /2;
    if(sLength % 2 == 1 ){
        answer = s.substring(sMid, sMid + 1);

    }else{
        answer = s.substring(sMid -1 , sMid + 1);
    }
    return answer;
}