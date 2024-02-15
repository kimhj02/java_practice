package generic_practice;

class box1<t>
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

public class generic3 {
    public static void main(String[] args) {
        box1<Integer> ibox = new box1<>();
        ibox.set(125);
        int num = ibox.get();
        System.out.println(num);
    }
}
