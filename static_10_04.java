
class circle{
    static final double PI = 3.1415;
    private double radius;

    circle(double rad) //������
    {
        radius = rad;
    }

    void showperimeter()
    {
        double peri = (radius * 2) * PI;
        System.out.println("�ѷ� : " + peri);
    }
    void showarea()
    {
        double area = (radius * radius) * PI;
        System.out.println("���� : "+ area);
    }
}

public class static_10_04 {
    public static void main(String[] args) {
        circle c = new circle(1.2);
        c.showperimeter();
        c.showarea();
    }
}
