package chap12;
//println �Ǵ� print�� �ν��Ͻ��� ���� ���� ���޵Ǹ� �ش� ���� ����
//�����ϴ� �ν��Ͻ��� toString �޼ҵ尡 ��ȯ�ϴ� ���ڿ� ���
class box
{
    private String conts;

    box(String cont)
    {
        this.conts = cont;
    }
    public String toString()
    {
        return conts;
    }
}

public class console_01 {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("12");
        stb.append(34);
        System.out.println(stb.toString());
        System.out.println(stb);

        box box1 = new box("camera");
        System.out.println(box1.toString());
        System.out.println(box1);


    }
}
