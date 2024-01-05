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
        System.out.println("주민등록 번호 : " + reginum);

        if(passnum != 0)
            System.out.println("여권 번호 : " + passnum + '\n');
        else
            System.out.println("여권 없음 " + '\n');
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
