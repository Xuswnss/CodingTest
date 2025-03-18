package Lv1.제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
    if(arr.length == 1){
        return new int[]{-1};
    }

    int min = Arrays.stream(arr).min().getAsInt();

    ArrayList<Integer> list = new ArrayList<>();
    for(int num : arr){
        if(num != min){
            list.add(num);
        }
    }

    answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}