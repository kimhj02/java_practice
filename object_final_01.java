package chap16;
//object
class cake{
    public String toString()
    {
        System.out.println(super.toString());
        return "my birthday cake";
    }
}

class cheesecake extends cake{
    public String toString()
    {
        return "my birthday cheese cake";
    }
}

public class object_final_01 {
    public static void main(String[] args) 
    {
        cake c1 = new cake();
        cake c2 = new cheesecake();

        System.out.println(c1);

        System.out.println();

        System.out.println(c2);
    }
}
