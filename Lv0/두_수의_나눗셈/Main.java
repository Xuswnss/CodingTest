package Lv0.두_수의_나눗셈;
/*
* 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에
*  1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.*/
public class Main {

// TODo : 소숫접 형태인 float 형태로 먼저 바꾸고 곱해줘서 나온 값을 결과를 int로 캐스팅을 해주어야 한다.
    public int solution(int num1, int num2) {
        return (int)(((float)num1 / (float)num2) * 1000);

    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution(4, 2));
    }
}// end Main
