package chap16;
//클래스와 메소드의 final 선언
//final 선언을 하면 상속할 수 없다

class parentadder{
    public int add(int a, int b)
    {
        return a+b;
    }
}

class childadder extends parentadder{
    //상위 클래스의 add를 오버라이딩 하려 함
    public double add(double a,double b){
        System.out.println("덧셈 진행");
        return a+b;
    }

}

public class object_final_02 {
    public static void main(String[] args) {
        parentadder adder = new childadder();
        System.out.println(adder.add(3,4));
    }
}
