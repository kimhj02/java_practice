package chap11;
//string �ν��Ͻ��� immutable �ν��Ͻ�
//�ν��Ͻ� �ȿ����� �� ��ȯ �Ұ���

public class overload_04 
{
    public static void main(String[] args) 
    {
    String str1 = "simple string";
    String str2 = "simple string";

    String str3 = new String("simple string");
    String str4 = new String("simple string");

    if(str1 == str2)
    {
        System.out.println("���� �ν��Ͻ�");
    }
    else 
    {
        System.out.println("�ٸ� �ν��Ͻ�");
    }

    if(str3 == str4)
    {
        System.out.println("���� �ν��Ͻ�");
    }
    else 
    {
        System.out.println("�ٸ� �ν��Ͻ�");
    }
    }
}
