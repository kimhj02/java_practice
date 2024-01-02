package project_practice.chap02.chap03;

public class const_03_01 {
    public static void main(String[] args) {
        //상수 선언 final
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;   //값을 한번만 할당 가능
        CONST_ASSIGNED = 12;    //한번 할당
        System.out.println(MAX_SIZE);
        System.out.println(CONST_CHAR);
        System.out.println(CONST_ASSIGNED);

        //정수형 상수의 표현 방법
        //10진수
        int num1 = 11 + 22 + 33;
        //8진수
        int num2 = 011 + 022 + 033;
        //16진수
        int num3 = 0x11 + 0x22 + 0x33;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //long형 정수를 써야하는 경우
        //System.out.println(3147483647 + 3147483648);
        System.out.println(3147483647L + 3147483648L);

        //2진수 표현
        byte seven = 0B111;
        int num205 = 0B11001101;

        //편리한 기능
        int num = 100_00_000;

        //3.4e3 = 3.4*10*10*10 = 3400.0
        
        //특수문자
        System.out.println("ab" + '\b' + 'c');
        System.out.println("ab" + '\t' + 'c');
        System.out.println("ab" + '\n' + 'c');
        System.out.println("ab" + '\r' + 'c');

     }
}
