function solution(s){
    let answer = true;
    s = s.toLowerCase();
    let p = s.split('p').length ;
    let y = s.split('y').length;
    if( p !== y ){
        answer = false;
    }


    return answer;
}