package chap14;
//extends�� ����� �ǹ��Ѵ�.
//super��� ����
class man{
    String name;

    public man(String name)
    {
        this.name = name;
    }
    public void tellyourname()
    {
        System.out.println("My name is " + name);
    }
}

class businessman extends man{
    String company;
    String position;

    public businessman(String name,String company,String position){
        //���� Ŭ���� man�� ��� �ʱ�ȭ
        super(name);
        //Ŭ���� businessman�� ��� �ʱ�ȭ
        this.company = company;
        this.position = position;
    }

    public void tellyouinfo()
    {
        System.out.println("my company is " + company);
        System.out.println("my position is" + position);
        tellyourname();
    }
}

public class Inheritance_01 
{
    public static void main(String[] args)
    {
       businessman man = new businessman("kim", "hired", "senior");
       man.tellyouinfo();
    }

}