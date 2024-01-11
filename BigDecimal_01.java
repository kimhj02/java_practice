package chap20;

import java.math.BigDecimal;

public class BigDecimal_01 {
    public static void main(String[] args) {
        double d1 = 1.6;
        double d2 = 0.1;
        System.out.println("덧셈 결과 : " + (d1+d2));
        System.out.println("곱셈 결과 : " + (d1*d2));
        //오차가 있다

        BigDecimal d3 = new BigDecimal("1.6");//실수를 문자열로 전달해야지 오차가 생기지 않는다.
        BigDecimal d4 = new BigDecimal("0.1");
        System.out.println("덧셈 결과 : " + d3.add(d4));
        System.out.println("곱셈 결과 " + d3.multiply(d4));
        //오차 없음
    }
}
