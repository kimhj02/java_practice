package project_practice.chap02.chap02;

public class value_02_01 {
    public static void main(String[] args) 
    {
        int num1;
        num1 = 10;

        int num2 = 20;
        int num3 = num1+ num2;
        System.out.println(num1 + "+" + num2 + "=" + num3);

        //boolean 참과 거짓
        //char 문자
        //byte sourt, int ,long 정수
        //float, double 실수

        double num4, num5;
        double result;
        num4 = 1.000001;
        num5 = 2.000001;
        result = num4 + num5;   //오차가 있을 수 있음
        System.out.println(result);

    }
}
