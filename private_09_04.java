package project_practice.chap02.chap09;

//ĸ��ȭ o

class sinuscap{
    void snitake(){
        System.out.println("�๰ ġ��");
    }
    void snetake()
    {
        System.out.println("��ä�� ġ��");
    }
    void snutake()
    {
        System.out.println("�� ġ��");
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