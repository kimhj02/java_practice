package project_practice.chap02.chap09;

//Ä¸½¶È­ x
class sinivelcap{
    void take(){
        System.out.println("Äà¹°");
    }
}
class sneezecap{
    void take(){
        System.out.println("ÀçÃ¤±â");
    }
}
class snufflecap
{
    void take(){
        System.out.println("ÄÚ");
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

        //Äà¹°
        suf.takesinivelcap(new sinivelcap());
        
        //ÀçÄ¡±â
        suf.takesinivelcap(new sneezecap());

        // ÄÚ¸·Èû
        suf.takesinivelcap(new snufflecap());
        }
}
