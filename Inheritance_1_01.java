package chap15;
//����� �⺻ ���� IS - A����
//���� Ŭ������ ���� Ŭ������ ��� Ư���� ���Ѵ�
//smartphone�� mobilephone�� ��� Ư���� ���Ѵ�
class mobilephone {
    private String number;

    public mobilephone(String num)
    {
        number = num;
    }
    public void answer(){
        System.out.println("hi ~ from " + number);
    }
}

class smartphone extends mobilephone{
    private String androidver;

    public smartphone(String num, String ver)
    {
        super(num);
        androidver = ver;
    }
    public void playapp()
    {
        System.out.println("app is running in " + androidver);
    }
}
public class Inheritance_1_01 {
    public static void main(String[] args) 
    {
        smartphone phone = new smartphone("010-2128-8931", "nougat");
        phone.answer();
        phone.playapp();
    }
}
