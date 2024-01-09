package chap18;
//Throwable : 자바의 최상위 클래스인 java.lang.Object를 제외하고
//예외 클래스의 최상위 클래스
//getMessage() : 예외의 원인을 담고 있는 문자열을 반환
//printStackTrace() : 예외가 발생한 위치와 호출된 메소드의 정보를 출력

public class excepiton_02 
{
    public static void md1(int n)
    {
        md2(n,0);
    }
    public static void md2(int n1, int n2)
    {
        int r = n1/n2;  //예외지점 발생
    }
    public static void main(String[] args) {
        md1(3);
        System.out.println("good bye~");
    }
}
