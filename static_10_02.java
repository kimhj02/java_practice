
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
        accessway way = new accessway();  //�����ڸ� ���� ����
        way.num++;  //�ܺο��� �ν��Ͻ��� �̸��� ���� ����
        accessway.num++;    // �ܺο��� Ŭ������ �̸��� ���� ����
        System.out.println("num =" + accessway.num);
    }
}
