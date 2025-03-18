function solution(n) {

    for(i =1 ; i <= n ; i++){
        if(Math.pow(i , 2) === n){
            return Math.pow((i+2), 2)
        }
    }
    return -1;
}