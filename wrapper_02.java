package chap20;
//�ڽ̰� ��ڽ� ����
//�⺻ �ڷ����� �ڽ��ϸ� �ν��Ͻ��� �ٲ��.
//�ν��Ͻ��� ��ڽ��ϸ� �⺻ �ڷ������� �ٲ��.

public class wrapper_02 {
    public static void main(String[] args) {
        Integer iobj = new Integer(10); //�ڽ�
        Double dobj = new Double(3.14); //�ڽ�
        System.out.println(iobj);
        System.out.println(dobj);
        System.out.println();

        int num1 = iobj.intValue();     //��ڽ� 
        double num2 = dobj.doubleValue();   //��ڽ�
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        //���� �ν��Ͻ� ���� ���� ���

        iobj = new Integer(iobj.intValue() + 10);
        dobj = new Double(dobj.doubleValue() + 1.2);
        System.out.println(iobj);
        System.out.println(dobj);

    }
}
