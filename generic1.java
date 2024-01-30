class apple{
    public String toString()
    {
        return "i am a apple.";
    }
}

class orange{
    public String toString()
    {
        return "i am an orange";
    }
}

class applebox{
    private apple ap;

    public void set(apple a)
    {
        ap = a;
    }
    public apple get()
    {
        return ap;
    }
}

class orangebox{
    private orange or;

    public void set(orange o)
    {
        or = o;
    }
    public orange get()
    {
        return or;
    }
}

public class generic1 {
    public static void main(String[] args) {
        applebox abox = new applebox();
        orangebox obox = new orangebox();

        abox.set(new apple());
        obox.set(new orange());

        apple ap = abox.get();
        orange og = obox.get();

        System.out.println(ap.toString()); //toString을 사용한것과 아닌것이 같다
        System.out.println(og);
    }
}
