package generic_practice;
//제네릭 메소드의 정의

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
    public static <t> box5<t> makebox(t o) //메소드 이름 makebox 반환형 box5<t>이다 
    {
        box5<t> box = new box5<t>();    //boxfactory의 makebox메소드에서 box5 클래스의 객체 생성
        box.set(o); //box5의 메소드를 사용하여 초기화
        return box; //box5의 형태로 반환
    }
}

public class generic6 
{
    public static void main(String[] args) {
        box5<String> sbox = boxfactory.makebox("sweet"); //반환형은 box5<String>으로 설정
        System.out.println(sbox.get());

        box5<Double> dbox = boxfactory.makebox(7.59); //반환형은 box5<Double>으로 설정
        System.out.println(dbox.get());
    }
}