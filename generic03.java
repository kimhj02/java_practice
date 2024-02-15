package generic_practice2;
//���ϵ�ī��

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

    //���� ���� ���빰�� Ȯ���ϴ�(����ϴ�) ����� ���׸� �޼ҵ�
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