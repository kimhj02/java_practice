package chap16;
//Ŭ������ �޼ҵ��� final ����
//final ������ �ϸ� ����� �� ����

class parentadder{
    public int add(int a, int b)
    {
        return a+b;
    }
}

class childadder extends parentadder{
    //���� Ŭ������ add�� �������̵� �Ϸ� ��
    public double add(double a,double b){
        System.out.println("���� ����");
        return a+b;
    }

}

public class object_final_02 {
    public static void main(String[] args) {
        parentadder adder = new childadder();
        System.out.println(adder.add(3,4));
    }
}
