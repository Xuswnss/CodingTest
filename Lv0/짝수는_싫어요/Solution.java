package Lv0.짝수는_싫어요;

import java.util.ArrayList;

public class Solution {
    public static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i += 2) { // 1부터 2씩 증가 (홀수만 선택)
            list.add(i);
        }

        // ArrayList를 int[] 배열로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result = solution(10);
        for (int num : result) {
            System.out.print(num + " "); // 1 3 5 7 9
        }
    }
}
