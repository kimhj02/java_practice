package project_practice.chap02.chap04;

public class operator_04_02 {
    public static void main(String[] args) {
        //관계 연산자
        System.out.println(3>=2);
        System.out.println(3 <=2);
        System.out.println(7.0 == 7);//자동 형 변환
        System.out.println(7.0 != 7);//자동 형 변환

        //논리 연산자
        int num1 = 11;
        int num2 = 22;
        boolean result;

        result = (1 < num1) && (num1 < 100);
        System.out.println(result);//true

        result = ((num2 %2) == 0) && ((num2 % 3) == 0);
        System.out.println(result);//true

        result = !(num1 != 0);
        System.out.println(result); //false

        //증감 연산자
        //++ --
        int a = 10;
        int b = 20;
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(--a);
        System.out.println(++b);
    }
}
