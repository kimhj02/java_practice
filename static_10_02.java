
class accessway{
    static int num = 0;

    accessway(){
        incrcnt();
    }
    void incrcnt(){
        num++;
    }
}

public class static_10_02 {
    public static void main(String[] args) {
        accessway way = new accessway();  //생성자를 통한 접근
        way.num++;  //외부에서 인스턴스의 이름을 통한 접근
        accessway.num++;    // 외부에서 클래스의 이름을 통한 접근
        System.out.println("num =" + accessway.num);
    }
}
