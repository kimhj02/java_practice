package chap14;
//���� Ŭ������ ������ ���� ��
//���� Ŭ������ ������ ���� ��
//super�� ���� Ŭ�������� ���� Ŭ���� ȣ����
class supercls{
    public supercls()
    {
        System.out.println("i'm super class");
    }
}

class subcls extends supercls{
    public subcls()
    {
        super();
        System.out.println("i'm sub class");
    }
}

public class Inheritance_02 
{
    public static void main(String[] args) {
        new subcls();
    }
}
