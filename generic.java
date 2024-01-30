package generic;

class apple{
    public String toString()
    {
        return "i am a apple";
    }
}

class orange{
    public String toString()
    {
        return "i am a orange";
    }
}

class box{
    private Object ob;

    public void set(Object ob)
    {
        this.ob = ob;
    }
    public Object get()
    {
        return ob;
    }
}

public class generic {
    public static void main(String[] args) {
        box abox = new box();
        box obox = new box();

        abox.set(new apple());
        obox.set(new orange());

        apple ap = (apple)abox.get();
        orange og = (orange)obox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
