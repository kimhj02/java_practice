package chap18;
//Throwable : �ڹ��� �ֻ��� Ŭ������ java.lang.Object�� �����ϰ�
//���� Ŭ������ �ֻ��� Ŭ����
//getMessage() : ������ ������ ��� �ִ� ���ڿ��� ��ȯ
//printStackTrace() : ���ܰ� �߻��� ��ġ�� ȣ��� �޼ҵ��� ������ ���

public class excepiton_02 
{
    public static void md1(int n)
    {
        md2(n,0);
    }
    public static void md2(int n1, int n2)
    {
        int r = n1/n2;  //�������� �߻�
    }
    public static void main(String[] args) {
        md1(3);
        System.out.println("good bye~");
    }
}
