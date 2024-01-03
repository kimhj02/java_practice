package project_practice.chap02.chap06;
//method를 이용한 재귀
public class method_06_04 {
    public static void main(String[] args) 
    {
        System.out.println(factorial(5));
        System.out.println(power(2,5));
    }

    public static int factorial(int num)
    {
        if(num == 1)
            return 1;
        else
            return num*factorial(num-1);
    }
    public static int power(int x,int y)
    {
        if( y == 0)
        return 1;
        else
        return x * power(x,y-1);
    }
}
