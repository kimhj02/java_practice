package chap18;
//예외처리
//java.lang.ArithmeticException 수학 연산에서의 오류 상황을 의미하는 예외 클래스
//java.util.InputMismatchException 클래스 scanner를 통한 값의 입력에서의 오류 상황을 의미하는 예외 클래스


import java.util.InputMismatchException;
import java.util.Scanner;

public class excepiton_01 {
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("a/b...a?");
            int n1 = sc.nextInt();
            System.out.println("a/b...b?");
            int n2 = sc.nextInt();  
            System.out.printf("%d / %d = %d \n",n1,n2,n1/n2);//n2가 0이면 예외
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        //아래와 같다
        /*catch(ArithmeticException e | InputMismatchException e)
        {
            e.getMessage();
        }*/
        System.out.println("good bye");
        

    }
}