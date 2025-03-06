package Lv0.배열뒤집기;
/*
* 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
*  num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// 1. 직접 뒤집기
class Solution {
    public int[] solution(int[] num_list) {
        int first = 0; // 첫 번째 인덱스
        int last = num_list.length - 1; // 마지막 인덱스

        // 배열을 반으로 나누어 교환 (swap)
        while (first < last) { // 첫 번째 요소와 마지막 요소를 계속 교환하기 위해
            int temp = num_list[first]; // 현재 first 위치의 값 저장
            System.out.println("temp: " + temp);

            num_list[first] = num_list[last]; // 마지막 요소를 첫 번째 요소로 이동
            num_list[last] = temp; // 원래 first 값을 last 위치로 이동

            first++; // 왼쪽 인덱스를 오른쪽으로 이동
            last--;  // 오른쪽 인덱스를 왼쪽으로 이동
        }

        return num_list; // 뒤집힌 배열 반환
    }// end Solution


    // 2. reverse 사용
    // 2-1. (오답)
    public Integer[] reverseSolution(Integer[] num_list) {
        // 기본형 배열은 List로 변환 불가능하므로 int -> Integer로 변환해야함/
        List<?> list = Arrays.asList(num_list);
        // Arrays.asList(num_list)는 고정 크기 리스트라 내부적으로 반영되지 않음.
        //리스트를 ArrayList로 변환한 후 Collections.reverse()를 사용해야한다.
        Collections.reverse(list);
        return num_list;
        // 리스트를 조작하는 방식이므로 기존 배열이 변하지 않을 수도 있다. 따라서 리스트를 다시 배열로 변환해야한디.
    } // end reverseSolution

    // 정답.
    public Integer[] reverseSolutionAnser(Integer[] num_list) {
        // 1. 배열을 List로 변환 (Arrays.asList()는 고정 크기 리스트이므로 ArrayList로 변환)
        List<Integer> list = Arrays.asList(num_list);

        // 2. 리스트를 뒤집음 (Collections.reverse() 사용)
        Collections.reverse(list);

        // 3. 리스트를 다시 배열로 변환하여 반환
        return list.toArray(new Integer[0]);
    }

    // 3. stream 사용
    public int[] streamSolution(int[] num_list) {
        int[] reversedArr = IntStream.range(0, num_list.length)
                .map(i -> num_list[num_list.length -1 -i])
                .toArray();
        return reversedArr;
    }// end streamSolution

    public static void main(String[] args) {
        // 테스트용 배열
        int[] num_list = {1, 2, 3, 4, 5};
        Integer[] num_listInteger = {1, 2, 3, 4, 5}; // Integer 배열도 테스트

        // Solution 객체 생성
        Solution solution = new Solution();

        // 1. 직접 뒤집기 (while문 사용)
        int[] result1 = solution.solution(num_list);
        System.out.println("1. 직접 뒤집기: " + Arrays.toString(result1));

        // 2. reverse 사용 (오답, 고정 크기 리스트 문제)
        Integer[] result2 = solution.reverseSolution(num_listInteger);
        System.out.println("2. reverse 사용 (오답): " + Arrays.toString(result2));

        // 2-1. 정답 reverseSolution
        Integer[] result3 = solution.reverseSolutionAnser(num_listInteger);
        System.out.println("2-1. 정답 reverseSolution: " + Arrays.toString(result3));

        // 3. stream 사용
        int[] result4 = solution.streamSolution(num_list);
        System.out.println("3. stream 사용: " + Arrays.toString(result4));
    }
}

