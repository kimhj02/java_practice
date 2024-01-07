package chap13;

class Box{
    private String conts;

    Box(String cont)
        {this.conts = cont;}

    public String toString()
    {
        return conts;
    }
}

public class array_02 {
    public static void main(String[] args) {
        Box[] ar = new Box[3];

        ar[0] = new Box("FIRST");
        ar[1] = new Box("second");
        ar[2] = new Box("Third");

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);
        
    }
}
