package chap15;
//상속의 기본 조건 IS - A관계
//하위 클래스는 상위 클래스의 모든 특성을 지닌다
//smartphone은 mobilephone의 모든 특성을 지닌다
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
