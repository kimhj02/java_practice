package chap16;
//상속이 도움이 되는 상황
//상속 사용 후
class friend 
{
    protected String name;
    protected String phone;

    public friend(String na, String ph)
    {
        name = na;
        phone = ph;
    }

    public void showinfo()
    {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phone);
    }
}

class univfriend extends friend
{
    protected String major;

    public univfriend(String na,String ma, String ph)
    {
        super(na,ph);
        major = ma;
    }
    public void showinfo()
    {
        super.showinfo();
        System.out.println("전공 : " + major);
    }
}

class compfriend extends friend{
    protected String department;

    public compfriend(String na,String de, String ph)
    {
        super(na, ph);
        department = de;
    }
    public void showinfo()
    {
        super.showinfo();
        System.out.println("부서 : " + department);
    }
}

public class Inheritance_2_02 {
    public static void main(String[] args) 
    {
        friend[] frd = new friend[10];
        int count = 0;

        frd[count++] = new univfriend("kim", "computer", "010-222-3333");
        frd[count++] = new univfriend("park", "mecanic", "010-888-9999");
        frd[count++] = new compfriend("yoon", "r&d 1", "02-555-8888");
        frd[count++] = new compfriend("seo", "r&d 2", "02-444-8585");

        for(int i = 0; i < count; i++)
        {
            frd[i].showinfo();  //오버라이딩 한 메소드 호출
            System.out.println();
        }
    }
}
