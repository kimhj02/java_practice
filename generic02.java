package generic_practice2;
//TARGET е╬ют
class box1<t>
{
    private t ob;
    public void set(t o) {ob = o;}
    public t get() { return ob;}

}

class emptyboxfactory
{
    public static <t> box1<t> makebox()
    {
        box1<t> abox = new box1<t>();
        return abox;
    }
}

public class generic02 {
    public static void main(String[] args) {
        box1<Integer> ibox = emptyboxfactory.<Integer>makebox();
        ibox.set(25);
        System.out.println(ibox.get());
    }
}