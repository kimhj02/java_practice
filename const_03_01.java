package project_practice.chap02.chap03;

public class const_03_01 {
    public static void main(String[] args) {
        //��� ���� final
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '��';
        final int CONST_ASSIGNED;   //���� �ѹ��� �Ҵ� ����
        CONST_ASSIGNED = 12;    //�ѹ� �Ҵ�
        System.out.println(MAX_SIZE);
        System.out.println(CONST_CHAR);
        System.out.println(CONST_ASSIGNED);

        //������ ����� ǥ�� ���
        //10����
        int num1 = 11 + 22 + 33;
        //8����
        int num2 = 011 + 022 + 033;
        //16����
        int num3 = 0x11 + 0x22 + 0x33;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //long�� ������ ����ϴ� ���
        //System.out.println(3147483647 + 3147483648);
        System.out.println(3147483647L + 3147483648L);

        //2���� ǥ��
        byte seven = 0B111;
        int num205 = 0B11001101;

        //���� ���
        int num = 100_00_000;

        //3.4e3 = 3.4*10*10*10 = 3400.0
        
        //Ư������
        System.out.println("ab" + '\b' + 'c');
        System.out.println("ab" + '\t' + 'c');
        System.out.println("ab" + '\n' + 'c');
        System.out.println("ab" + '\r' + 'c');

     }
}
