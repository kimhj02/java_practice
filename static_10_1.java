
class instcnt{
    static int instnum = 0;

    instcnt()
    {
        instnum++;
        System.out.println("인스턴스 생성 " + instnum);
    }
}

public class static_10_1 {
    public static void main(String[] args) 
    {
        instcnt cnt1 = new instcnt();
        instcnt cnt2 = new instcnt();
        instcnt cnt3 = new instcnt();
    }
    
}
