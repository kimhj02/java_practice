package generic_practice2;

class box_04<t>{
    private t ob;
    public void set(t o){ob = o;}
    public t get() {return ob;}

    @Override
    public String toString()
    {
        return ob.toString();
    }
}

class unboxer_04{
    public static <t> t openbox(box_04<t> box){
        return box.get();
    }
    public static void peekbox(box_04<?> box)
    {
        System.out.println(box);
    }
}

public class generic04 {
    public static void main(String[] args) {
        box_04<String> box = new box_04<>();
        box.set("so simple string");
        unboxer_04.peekbox(box);
    }
}