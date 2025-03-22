package Lv1.같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int prev = -1;
        for(int num : arr) {
            if(num!= prev){
                list.add(num);
            }
            prev = num;
        }
        //리스트를 배열로 반환
        answer = list.stream().mapToInt(i->i).toArray();

        return answer;
    }
}