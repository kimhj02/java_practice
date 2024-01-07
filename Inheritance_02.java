package chap14;
//상위 클래스의 생성자 실행 후
//하위 클래스의 생성자 실행 됨
//super로 하위 클래스에서 상위 클래스 호출함
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
