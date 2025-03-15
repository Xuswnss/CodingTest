package Lv1.문자열내p와y의개수;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s= s.toLowerCase();
        int p =0, y=0;
        for( char i : s.toCharArray()){
            if(i == 'p') p++;
            else if(i == 'y') y++;
        }
        if(p != y) answer = false;



        return answer;
    }
}