package chap20;
//BigInteger�� ���Ͽ� ������ �� �� �ִ�.
//add.subtract,multiply,divide,remainder 
import java.math.BigInteger;

public class BigInteger_01 {
    public static void main(String[] args) 
    {
        System.out.println("�ִ� ���� : " + Long.MAX_VALUE);    //long������ ��Ÿ�� �� �ִ� �ִ�
        System.out.println("�ּ� ���� : " + Long.MIN_VALUE);    //long������ ��Ÿ�� �� �ִ� �ּڰ�
        System.out.println();
        BigInteger big1 = new BigInteger("100000000000000000000");
        BigInteger big2 = new BigInteger("-99999999999999999999");

        BigInteger r1 = big1.add(big2);
        System.out.println(r1);

        BigInteger r2 = big1.multiply(big2);
        System.out.println(r2);
        System.out.println();

        int num = r1.intValueExact();
        System.out.println(num);
        
    }
}
