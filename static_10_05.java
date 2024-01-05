class numberprinter{

    private int mynum;
    
    static void showint(int n)
    {
        System.out.println(n);
    }
    static void showdouble(double n)
    {
        System.out.println(n);
    }

    void setmynumber(int n)
    {
        mynum = n;
    }
    void showmynumber()
    {
        showint(mynum);
    }
}

public class static_10_05 {
    public static void main(String[] args) {
        numberprinter.showint(20);

        numberprinter np = new numberprinter();
        np.showdouble(3.15);
        np.setmynumber(75);
        np.showmynumber();
    }
}
