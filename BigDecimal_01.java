package chap20;

import java.math.BigDecimal;

public class BigDecimal_01 {
    public static void main(String[] args) {
        double d1 = 1.6;
        double d2 = 0.1;
        System.out.println("���� ��� : " + (d1+d2));
        System.out.println("���� ��� : " + (d1*d2));
        //������ �ִ�

        BigDecimal d3 = new BigDecimal("1.6");//�Ǽ��� ���ڿ��� �����ؾ��� ������ ������ �ʴ´�.
        BigDecimal d4 = new BigDecimal("0.1");
        System.out.println("���� ��� : " + d3.add(d4));
        System.out.println("���� ��� " + d3.multiply(d4));
        //���� ����
    }
}
