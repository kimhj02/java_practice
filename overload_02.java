package chap11;

class person{
    private int reginum;
    private int passnum;

    person(int rnum, int pnum)
    {
        reginum = rnum;
        passnum = pnum;
    }

    person(int rnum)
    {
        this(rnum,0);
    }
    void showpersoninfo()
    {
        System.out.println("�ֹε�� ��ȣ : " + reginum);

        if(passnum != 0)
            System.out.println("���� ��ȣ : " + passnum + '\n');
        else
            System.out.println("���� ���� " + '\n');
    }
}

public class overload_02 {

    public static void main(String[] args) {
        person kim = new person(335577,112233);

        person park = new person(775544);

        kim.showpersoninfo();
        park.showpersoninfo();
    }
}
