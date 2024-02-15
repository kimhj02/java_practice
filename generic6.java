package generic_practice;
//���׸� �޼ҵ��� ����

class box5<t>
{
    private t ob;

    public void set(t o)
    {
        ob = o;
    }
    public t get(){
        return ob;
    }
}

class boxfactory{
    public static <t> box5<t> makebox(t o) //�޼ҵ� �̸� makebox ��ȯ�� box5<t>�̴� 
    {
        box5<t> box = new box5<t>();    //boxfactory�� makebox�޼ҵ忡�� box5 Ŭ������ ��ü ����
        box.set(o); //box5�� �޼ҵ带 ����Ͽ� �ʱ�ȭ
        return box; //box5�� ���·� ��ȯ
    }
}

public class generic6 
{
    public static void main(String[] args) {
        box5<String> sbox = boxfactory.makebox("sweet"); //��ȯ���� box5<String>���� ����
        System.out.println(sbox.get());

        box5<Double> dbox = boxfactory.makebox(7.59); //��ȯ���� box5<Double>���� ����
        System.out.println(dbox.get());
    }
}