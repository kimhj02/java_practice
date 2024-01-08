package chap16;
//상속이 도움이 되는 상황
//상속 사용 전
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
        System.out.println("이름 : " + name);
        System.out.println("전공 : " + major);
        System.out.println("전화 : " +phone);
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
        System.out.println("이름 : " + name);
        System.out.println("전공 : " + department);
        System.out.println("전화 : " +phone);
    }
}


public class Inheritance_2_01 {
    public static void main(String[] args) 
    {
        //대학 동창의 관리를 위한 배열과 변수
        univfriend[] ufrns = new univfriend[5];
        int ucnt = 0;

        // 직장 동료의 관리를 위한 배열과 변수
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
