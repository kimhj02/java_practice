package chap15;
//�������̵�
//cheesecake�� cake�� �������̵� ��
//�����ϴ� ��Ȳ���� �޼ҵ��� �̸��� ������ ���� Ŭ������ �޼ҽ� ����
class cake{
    public void yummy()
    {
        System.out.println("yummy cake");
    }
}

class cheesecake extends cake{
    public void yummy()
    {
        super.yummy();  //super�� ���� Ŭ���� �޼ҵ� ȣ�� ����
        System.out.println("yummy cheeze cake");
    }
    public void tasty()
    {
        super.yummy();
        System.out.println("yummy tasty cake");
    }
}

public class Inheritance_1_03 {
    public static void main(String[] args) {
        cake c1 = new cheesecake();
        cheesecake c2 = new cheesecake();

        c1.yummy();
        c2.yummy();

    }
}
