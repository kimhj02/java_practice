package project_practice.chap02.chap05;

public class loop_05_01 
{
    public static void main(String[] args) {
        //if 문
        int n1 = 5;
        int n2 = 7;

        if(n1 < n2)
        {
            System.out.println("n1 < n2 is true");
        }
        //if ~ else 문
        if(n1==n2)
        {
            System.out.println("n1 == n2 is true");
        }
        else{
            System.out.println("n1 == n2 is false");
        }
        
        //else if
        int num = 20;

        if(num < 0)
        {
            System.out.println("0 미만");
        }
        else if(num < 100)
            System.out.println("0 이상 100 미만");
        else
            System.out.println("100 이상");

        //if ~ else와 유사한 성격의 조건 연산자
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        big = (num1 > num2) ? num1 : num2;
        System.out.println("큰 값 :" + big);

        diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.println("절대값 : " + diff);
        
    }
}
