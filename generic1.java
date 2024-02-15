package generic_practice;

class apple{
    public String toString()
    {
        return "i am an apple";
    }
}

class orange{
    public String toString()
    {
        return "i am an orange";
    }
}

class box<a>{
    private a ob;
    public void set(a o)
    {
        ob = o;
    }
    public a get()
    {
        return ob;
    }
}

public class generic1 {
    public static void main(String[] args) {
        box<apple> abox = new box<apple>();
        box<orange> obox = new box<orange>();

        abox.set(new apple());
        obox.set(new orange());

        apple ap = (apple)abox.get();
        orange or = (orange)obox.get();

        System.out.println(ap);
        System.out.println(or);

    }
}
