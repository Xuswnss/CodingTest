package Lv0.머쓱이보다_키_큰_사람;

// 배열을 순회하면서 height보다 큰 값을 찾아 개수를 세자
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for( int cnt : array){
            if( cnt > height){
                answer++;
            }
        }

        return answer;
    }
}