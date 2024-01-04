package project_practice.chap02.chap09;

//캡술화 o

class sinuscap{
    void snitake(){
        System.out.println("콧물 치료");
    }
    void snetake()
    {
        System.out.println("재채기 치료");
    }
    void snutake()
    {
        System.out.println("코 치료");
    }

    void take()
    {
        snitake();
        snetake();
        snutake();
    }
}

class coldpatient
{
    void takesinus(sinuscap cap)
    {
        cap.take();
    }
}
public class private_09_04 {
    public static void main(String[] args) {
        coldpatient suf = new coldpatient();
        suf.takesinus(new sinuscap());
    }
}