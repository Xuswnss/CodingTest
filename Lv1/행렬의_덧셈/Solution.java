package Lv1.행렬의_덧셈;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length; // 행의 개수
        int cols = arr1[0].length; // 열의  개수
        int[][] answer = new int[rows][cols];
        //2차원 배열을 돌면서 각원소 더하기
        for (int i = 0; i < rows; i++) { // 행을 순회
            for (int j = 0; j < cols; j++) { // 열을 순회
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}