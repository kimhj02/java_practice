package generic_practice;
//제네릭 클래스의 타입 인자를 인터페이스로 제한하기
interface food{
    public String eat();
}

class rice implements food
{
    public String toString()
    {
        return "i am a rice";
    }
    
    @Override
    public String eat()
    {
        return "it tastes so good";
    }
}

class box4<t extends food>
{
    t ob;

    public void set(t o)
    {
        ob = o;
    }
    public t get()
    {
        System.out.println(ob.eat());
        return ob;
    }
}

public class generic5 {
    public static void main(String[] args) {
        box4<rice> box = new box4<>();
        box.set(new rice());

        rice rc = box.get();
        System.out.println(rc);
    }
}