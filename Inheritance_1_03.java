package chap15;
//오버라이딩
//cheesecake가 cake를 오버라이딩 함
//참조하는 상황에서 메소드의 이름이 같으면 하위 클래스의 메소스 실행
class cake{
    public void yummy()
    {
        System.out.println("yummy cake");
    }
}

class cheesecake extends cake{
    public void yummy()
    {
        super.yummy();  //super로 상위 클래스 메소드 호출 가능
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
