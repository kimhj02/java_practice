package generic_practice2;

//제네릭 클래스와 상속

class box<t>
{
    protected t ob;
    public void set(t o) {ob = o;}
    
    public t get() {return ob; }
}

class steelbox<t> extends box<t>{
    public steelbox(t o)
    {
        ob = o;
    }
}

public class generic01 {
    public static void main(String[] args) 
    {
        box<Integer> ibox = new steelbox<>(7959);
        box<String> sbox = new steelbox<>("simple");
        System.out.println(ibox.get());
        System.out.println(sbox.get());
    }
}