package chap12;
//println 또는 print에 인스턴스의 참조 값이 전달되면 해당 참조 값이
//참조하는 인스턴스의 toString 메소드가 반환하는 문자열 출력
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
