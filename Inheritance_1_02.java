package chap15;
//메소드 오버라이딩

class mobilephone {
    protected String number;

    public mobilephone(String num)
    {
        number = num;
    }
    public void answer(){
        System.out.println("hi ~ from " + number);
    }
}

class smartphone extends mobilephone{
    private String androidver;

    public smartphone(String num, String ver)
    {
        super(num);
        androidver = ver;
    }
    public void playapp()
    {
        System.out.println("app is running in " + androidver);
    }
}

public class Inheritance_1_02 {
    public static void main(String[] args) 
    {
        smartphone ph1 = new smartphone("01021288931", "google");
        mobilephone ph2 = new smartphone("01054448931", "google1");

        ph1.answer();
        ph1.playapp();

        ph2.answer();
        //ph2.playapp();
    }   
}
