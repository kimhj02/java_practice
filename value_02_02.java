package project_practice.chap02.chap02;

public class value_02_02 {
    public static void main(String[] args) 
    {
        short num1 = 11;
        short num2 = 22;
        //short result = num1 +num2; java������ ������ int�� ��
        //System.out.println(result);
        int result = num1 + num2;
        System.out.println(result);

        //long���� int���� ��ȯ�� ����
        //float�� 6�ڸ����� ���� x double�� 15�ڸ����� ���� x
        double a = 2.0001, b = 3.0001;
        System.out.println((double)a+b);
        //���� �ڷ��� char
        char ch1 = '��';
        char ch2 = 'Ȯ';
        char ch3 = 54736;   //�����ڵ� ��
        char ch4 = 54869;
        char ch5 = 0xD5D0;  //�����ڵ� 16���� ��
        char ch6 = 0xD655;
        System.out.println(ch1 + " " + ch2);
        System.out.println(ch3 + " " + ch4);
        System.out.println(ch5 + " " + ch6);

        boolean blue = true;
        boolean red = false;
        
        System.out.println(blue);
        System.out.println(red);

        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
    }
}
