package chap20;
//���� �ڽ̰� ��� ����
//���� Ŭ������ ���� ��, �⺻ �ڷ������� �����Ϸ��� �ϸ� ���� �ڽ��� �Ͼ
//�⺻ �ڷ������� ���� ��, ���� Ŭ������ �����Ϸ��� �ϸ� ���� ��ڽ��� �Ͼ

public class wrapper_03 {
    public static void main(String[] args) {
        Integer iobj = 10;  //���� �ڽ�
        Double dobj = 3.14; //���� �ڽ�
        System.out.println(iobj);
        System.out.println(dobj);
        System.out.println();

        int num1 = iobj;    //���� ��ڽ�
        double num2 = dobj; //���� ��ڽ�

        System.out.println(num1);
        System.out.println(num2);

        Integer num = 10;   //���� �ڽ�
        num++;  //���� �ڽ�, ���� ��ڽ� ���� ����
        System.out.println(num);

        num += 3;   //���� �ڽ�, ���� ��ڽ� ���� ����
        System.out.println(num);

        int r = num +5; //���� ��ڽ� ����
        Integer robj = num - 5; //���� ��ڽ� ����
        System.out.println(r);
        System.out.println(robj);

        
    }
}
