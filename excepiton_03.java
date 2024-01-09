package chap18;
//printStackTrace() 예외가 발생한 위치와 호출된 메소드의 정보를 출력
//getmessage() 예외의 원인을 담고 있는 문자열을 반환
public class excepiton_03 {
    public static void md1(int n )
    {
        md2(n,0);
    }
    public static void md2(int n1, int n2)
    {
        int r = n1 / n2;
    }
    public static void main(String[] args) 
    {
        try{
            md1(3);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
        System.out.println("good bye ~");
    }
}
