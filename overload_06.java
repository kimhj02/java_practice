package chap11;
//valueOf�� ���� ���ڿ��� ��ȯ
//+������ concat�� valueOf�� ��ģ �����̴�
//concat�� �������� ��� ����

public class overload_06 {
    public static void main(String[] args) {
        double e = 2.718;
        String st1 = "asdf".concat(String.valueOf(e));
        System.out.println(st1);
        String st2 = "��".concat("��").concat("��");
        System.out.println(st2);
        System.out.println();


        StringBuilder stbuf = new StringBuilder("123");
        stbuf.append(45678);

        System.out.println(stbuf.toString());

        stbuf.delete(0,2); // ���ڿ� �Ϻ� ����
        System.out.println(stbuf.toString());

        stbuf.replace(0,3,"AB");    //���ڿ� �Ϻ� ��ü
        System.out.println(stbuf.toString());

        stbuf.reverse();    //���ڿ� ���� ������
        System.out.println(stbuf.toString());

        String sub = stbuf.substring(2,4);
        System.out.println(sub);
    }
}
