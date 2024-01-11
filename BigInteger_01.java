package chap20;
//BigInteger을 통하여 연산을 할 수 있다.
//add.subtract,multiply,divide,remainder 
import java.math.BigInteger;

public class BigInteger_01 {
    public static void main(String[] args) 
    {
        System.out.println("최대 정수 : " + Long.MAX_VALUE);    //long형으로 나타낼 수 있는 최댓값
        System.out.println("최소 정수 : " + Long.MIN_VALUE);    //long형으로 나타낼 수 있는 최솟값
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
