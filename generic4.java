package generic_practice;
//���׸� Ŭ������ Ÿ�� ���� ����
class box2<t extends Number>
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

public class generic4 {
    public static void main(String[] args) {
        box2<Integer> ibox = new box2<>();
        ibox.set(24);

        box2<Double> dbox = new box2<>();
        dbox.set(3.141952);

        int num1 = ibox.get();
        double num2 = dbox.get();

        System.out.println(num1 + " " + num2);
    }
}
