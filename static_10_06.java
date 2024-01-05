class simplecalculator {
    static final double PI = 3.1415;

    double add(double n1, double n2)
    {
        return n1+n2;
    }
    double min(double n1, double n2)
    {
        return n1 - n2;
    }
    double calcirclearea(double r)
    {
        return PI * r * r;
    }
    double calcircleperi(double r)
    {
        return PI * (r * 2);
    }
}

public class static_10_06 {
    public static void main(String[] args) {
        simplecalculator sc = new simplecalculator();
        System.out.println(sc.add(3,4));
        System.out.println(sc.calcirclearea(2.2));

        System.out.println(sc.min(15,7));
        System.out.println(sc.calcircleperi(5.0));
        System.out.println(Math.PI);
    }
}
