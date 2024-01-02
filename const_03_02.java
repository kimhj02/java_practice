package project_practice.chap02.chap03;

public class const_03_02 {
    public static void main(String[] args) 
    {
        //형 변환
        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);
        //과정
        //변수 num1에 저장된 값을 long형으로 변환하여 메모리에 임시 저장
        //이어서 이 변환된 값과 num2에 저장된 값을 대상으로 덧셈
        //자동 형 변환
        //규칙 1. 자료형의 크기가 큰 방향으로 형 변환이 일어난다
        //규칙 2. 자료형의 크기에 상관없이 정수 자료형보다 실수 자료형 우선
        //double num1 = 30;  정수 30이 실수로 변환
        System.out.println(59L + 34.5);//정수 59가 실수로 변환
        double pi = 3.1415;
        int wholenumber = (int)pi;
        System.out.println(wholenumber);
        short num3 = 1;
        short num4 = 2;
        //short num3 = num1 + num2;
        short num3 = (short)(num1 + num2);
    }
}
