package chap14;
//extends가 상속을 의미한다.
//super사용 버전
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
        //상위 클래스 man의 멤버 초기화
        super(name);
        //클래스 businessman의 멤버 초기화
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