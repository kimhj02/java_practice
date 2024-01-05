package chap11;
//매개변수의 정보가 달라지면 메소드 이름이 같더라도 구분 가능하다 
//반환형이 다른것은 오버로딩 조건이 아님!!

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
        reginum = rnum;
        passnum = 0;
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

public class overload_01 
{
    public static void main(String[] args) {
        person kim = new person(335577,112233);

        person park = new person(775544);

        kim.showpersoninfo();
        park.showpersoninfo();
    }
}
