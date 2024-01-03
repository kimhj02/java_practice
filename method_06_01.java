package project_practice.chap02.chap06;
//method == 함수이다
//void 값을 반환하지 않는 method
public class method_06_01 {
    public static void hieveryone(int age,double height)
    {
        System.out.println("좋은 아침입니다");
        System.out.println("제 나이는 " + age + "세 입니다");
        System.out.println("제 키는" + height + "cm입니다");
    }
    public static void main(String[] args) 
    {
        double meheight = 175.9;
        hieveryone(12,12.5);
        hieveryone(13,meheight);
        byeveryone();
    }
    public static void byeveryone()
    {
        System.out.println("다음에 뵙겠습니다");
    }
}
