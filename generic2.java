package generic_practice;

class DBox<L,R>
{
    private L left;
    private R right;

    public void set(L o, R r)
    {
        left = o;
        right = r;
    }

    @Override
    public String toString()
    {
        return left + " & " + right;
    }
}

public class generic2 {
    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("aplle",25);
        System.out.println(box);

    }
}