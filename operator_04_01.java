package project_practice.chap02.chap04;

public class operator_04_01 {
    public static void main(String[] args) 
    {
        //대입 연산자와 산술 연산자
        int val = 20;
        int val1 = 4 + 3;
        int val2 = 4-3;
        int val3 = 4*3;
        int val4 = 7/3;
        int val5 = 7%3;
        System.out.println(val);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);

        //복합 대입 연산자
        //a = a+b == a+=b;
        //a = a-b == a-=b
        //a = a*b == a*=b
        //a = a/b == a/=-b
        //a = a%b == a%=b

        short num = 10;
        num = (short)(num + 77L);
        int rate = 3;
        rate = (int)(rate * 3.5);
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L;
        rate = 3;
        rate *= 3.5;
        System.out.println(num);
        System.out.println(rate);
    }
}
