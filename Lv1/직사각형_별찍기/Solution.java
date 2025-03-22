package Lv1.직사각형_별찍기;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 행(가로)
        int b = sc.nextInt(); // 열(세로)
        for(int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}