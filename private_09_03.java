package project_practice.chap02.chap09;

//ĸ��ȭ x
class sinivelcap{
    void take(){
        System.out.println("�๰");
    }
}
class sneezecap{
    void take(){
        System.out.println("��ä��");
    }
}
class snufflecap
{
    void take(){
        System.out.println("��");
    }
}

class coldpatient{
    void takesinivelcap(sinivelcap cap){
        cap.take();
    }
    void takesinivelcap(sneezecap cap){
        cap.take();
    }
    void takesinivelcap(snufflecap cap)
    {
        cap.take();
    }
}


public class private_09_03 {
    public static void main(String[] args) {
        coldpatient suf = new coldpatient();

        //�๰
        suf.takesinivelcap(new sinivelcap());
        
        //��ġ��
        suf.takesinivelcap(new sneezecap());

        // �ڸ���
        suf.takesinivelcap(new snufflecap());
        }
}
