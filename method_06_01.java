package project_practice.chap02.chap06;
//method == �Լ��̴�
//void ���� ��ȯ���� �ʴ� method
public class method_06_01 {
    public static void hieveryone(int age,double height)
    {
        System.out.println("���� ��ħ�Դϴ�");
        System.out.println("�� ���̴� " + age + "�� �Դϴ�");
        System.out.println("�� Ű��" + height + "cm�Դϴ�");
    }
    public static void main(String[] args) 
    {
        double meheight = 175.9;
        hieveryone(12,12.5);
        hieveryone(13,meheight);
        byeveryone();
    }
    public static void byeveryone()
    {
        System.out.println("������ �˰ڽ��ϴ�");
    }
}
