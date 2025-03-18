package Lv1.하샤드수;

import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int[] arr = Integer.toString(x)
                .chars()
                .map( i -> i -'0')
                .toArray();
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        if(x % sum != 0) answer = false;
        return answer;
    }
}