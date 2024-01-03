package project_practice.chap02.chap06;
//반환값이 있는 method
public class method_06_02 
{
    public static void main(String[] args) {
        int result;
        result = adder(4,5);
        System.out.println("4 + 5 = " + result);
        System.out.println("3.5 * 3.5 =" + square(3.5));

        int num = 5;

        System.out.println("둘레 : " +(float)length(num) + " 넓이 : " + extent(num));

    }    

    public static int adder(int num1, int num2)
    {
        int addresult = num1 + num2;
        return addresult;
    }

    public static double square(double num)
    {
        return num*num;
    }

    public static double length(double num)
    {
        return 2*num*3.14;
    }

    public static double extent(double num)
    {
        return num*num*3.14;
    }
}
