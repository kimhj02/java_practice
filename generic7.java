package generic_practice;

class box6<t>
{
    private t ob;

    public void set(t o)
    {
        ob = o;
    }
    public t get()
    {
        return ob;
    }
}

class unboxer{
    public static <t> t openbox(box6<t> box)
    {
        return box.get();
    }
}

public class generic7 {
    public static void main(String[] args) {
        box6<String> box = new box6<>();
        box.set("my generic method");

        String str = unboxer.<String>openbox(box);
        System.out.println(str);
    }
}
