package project_practice.chap02.chap02;

public class value_02_02 {
    public static void main(String[] args) 
    {
        short num1 = 11;
        short num2 = 22;
        //short result = num1 +num2; java에서는 연산을 int로 함
        //System.out.println(result);
        int result = num1 + num2;
        System.out.println(result);

        //long에서 int로의 변환은 없다
        //float는 6자리까지 오차 x double은 15자리까지 오차 x
        double a = 2.0001, b = 3.0001;
        System.out.println((double)a+b);
        //문자 자료형 char
        char ch1 = '헐';
        char ch2 = '확';
        char ch3 = 54736;   //유니코드 값
        char ch4 = 54869;
        char ch5 = 0xD5D0;  //유니코드 16진수 값
        char ch6 = 0xD655;
        System.out.println(ch1 + " " + ch2);
        System.out.println(ch3 + " " + ch4);
        System.out.println(ch5 + " " + ch6);

        boolean blue = true;
        boolean red = false;
        
        System.out.println(blue);
        System.out.println(red);

        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
    }
}
