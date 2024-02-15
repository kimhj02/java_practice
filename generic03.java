package generic_practice2;
//와일드카드

class box2<t>
{
    private t ob;
    public void set(t o) { ob = o;}
    public t get() {return ob;}

    @Override
    public String toString()
    {
        return ob.toString();
    }
}

class unboxer{
    public static <t> t openbox(box2<t> box)
    {
        return box.get();
    }

    //상자 안의 내용물을 확인하는(출력하는) 기능의 제네릭 메소드
    public static <t> void peekbox(box2<t> box)
    {
        System.out.println(box);
    }
}

public class generic03 {
    public static void main(String[] args) 
    {
        box2<String> box = new box2<>();
        box.set("so simple String");
        unboxer.peekbox(box);
    }
}