package project_practice.chap02.chap09;
//정보 은닉 x
class Circle{
    double rad = 0;
    final double PI = 3.14;

    public Circle(double r)
    {    
        //아래에 정의된 setrad 메소드 호출을 통한 초기화
        setRad(r);
    }


    public void setRad(double r)
    {
        if(r < 0) {
            rad = 0;
            return;
        }
        rad = r;
    }
    public double getArea(){
        return (rad * rad) * PI;
    }
}
public class private_09_01 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(1.5);
        System.out.println(c.getArea());

        c.setRad(2.5);
        System.out.println(c.getArea());
        c.setRad(-3.3);
        System.out.println(c.getArea());
        c.rad = -4.5;       // 옳지 않은 접근 방법
        System.out.println(c.getArea());

    } 
}
