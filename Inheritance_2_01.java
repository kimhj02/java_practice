package chap16;
//����� ������ �Ǵ� ��Ȳ
//��� ��� ��
class univfriend {
    private String name;
    private String major;
    private String phone;

    univfriend(String na, String ma, String ph)
    {
        name = na;
        major = ma;
        phone = ph;
    }
    public void showinfo()
    {
        System.out.println("�̸� : " + name);
        System.out.println("���� : " + major);
        System.out.println("��ȭ : " +phone);
    }
}

class compfriend{
    private String name;
    private String department;
    private String phone;

    public compfriend(String na, String de, String ph)
    {
        name = na;
        department = de;
        phone = ph;
    }
    public void showinfo()
    {
        System.out.println("�̸� : " + name);
        System.out.println("���� : " + department);
        System.out.println("��ȭ : " +phone);
    }
}


public class Inheritance_2_01 {
    public static void main(String[] args) 
    {
        //���� ��â�� ������ ���� �迭�� ����
        univfriend[] ufrns = new univfriend[5];
        int ucnt = 0;

        // ���� ������ ������ ���� �迭�� ����
        compfriend[] cfrns = new compfriend[5];
        int ccnt = 0;

        ufrns[ucnt++] = new univfriend("lee", "cumputer", "010-111-2322");
        ufrns[ucnt++] = new univfriend("park", "mecanic", "010-222-4565");

        cfrns[ccnt++] = new compfriend("yoon", "r&d 1", "02-222-5555");
        cfrns[ccnt++] = new compfriend("kim", "r&d 2", "02-233-5555");

        for(int i = 0; i < ucnt; i++)
        {
            ufrns[i].showinfo();
            System.out.println();
        }

        for(int i = 0; i < ccnt; i++)
        {
            cfrns[i].showinfo();
            System.out.println();
        }
    }
}
