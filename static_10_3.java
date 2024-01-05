
//인스턴스를 생성하지 않고 static변수에 접근 가능
class a{

    static int b = 100;

    a()
    {
        b++;
        System.out.println(b);
    }
}

public class static_10_3 {
    public static void main(String[] args) {
        a.b -= 15;
        System.out.println(a.b);
    }
}
