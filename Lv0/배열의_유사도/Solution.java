package Lv0.배열의_유사도;

import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        HashSet<String> set = new HashSet<>();
        for(String str : s1){
            set.add(str);
        }

        for(String str : s2){
            if(set.contains(str)){
                answer++;
            }
        }
        return answer;
    }
}

/*
* HashSet은 중복을 허용하지 않고, 순서를 보장하지 않는 컬렉션이다. 내부적으로 해시테이블을 사용하여 데이터를 저장하므로, 데이터 검색과
* ㅊ가가 평균적으로 O(1)의 시간 복잡도를 가진다
*
* HashSet의 주요 특징
* 1. 중복불가
* 2. 순서 없음
* 3. 빠른 검색
* 4. Null허용*/