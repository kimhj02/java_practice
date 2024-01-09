package chap18;
//����ó��
//java.lang.ArithmeticException ���� ���꿡���� ���� ��Ȳ�� �ǹ��ϴ� ���� Ŭ����
//java.util.InputMismatchException Ŭ���� scanner�� ���� ���� �Է¿����� ���� ��Ȳ�� �ǹ��ϴ� ���� Ŭ����


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
            System.out.printf("%d / %d = %d \n",n1,n2,n1/n2);//n2�� 0�̸� ����
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        //�Ʒ��� ����
        /*catch(ArithmeticException e | InputMismatchException e)
        {
            e.getMessage();
        }*/
        System.out.println("good bye");
        

    }
}