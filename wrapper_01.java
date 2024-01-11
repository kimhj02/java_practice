package chap20;
//wrapper class
public class wrapper_01 {

    public static void showdata(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer iinst = new Integer(3);
        showdata(iinst);
        showdata(new Double(7.15));
        
    }
}
