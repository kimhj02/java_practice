package project_practice.chap02.chap03;

public class const_03_02 {
    public static void main(String[] args) 
    {
        //�� ��ȯ
        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);
        //����
        //���� num1�� ����� ���� long������ ��ȯ�Ͽ� �޸𸮿� �ӽ� ����
        //�̾ �� ��ȯ�� ���� num2�� ����� ���� ������� ����
        //�ڵ� �� ��ȯ
        //��Ģ 1. �ڷ����� ũ�Ⱑ ū �������� �� ��ȯ�� �Ͼ��
        //��Ģ 2. �ڷ����� ũ�⿡ ������� ���� �ڷ������� �Ǽ� �ڷ��� �켱
        //double num1 = 30;  ���� 30�� �Ǽ��� ��ȯ
        System.out.println(59L + 34.5);//���� 59�� �Ǽ��� ��ȯ
        double pi = 3.1415;
        int wholenumber = (int)pi;
        System.out.println(wholenumber);
        short num3 = 1;
        short num4 = 2;
        //short num3 = num1 + num2;
        short num3 = (short)(num1 + num2);
    }
}
