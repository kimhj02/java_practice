package project_practice.chap02.chap07;
//��������
//�޼ҵ带 ȣ���ϸ鼭 �ν��Ͻ��� ���� ���� ������ �� �ִ�
class bankaccount{
    int balance = 0;    //���� �ܾ�

    public int deposit(int amount)
    {
        balance += amount;
        return balance;
    }
    public int withdraw(int amount)
    {
        balance -= amount;
        return balance;
    }
    public int checkMyBalance()
    {
        System.out.println("�ܾ� : " + balance);
        return balance;
    }
}


public class class_07_03 {
    public static void main(String[] args) {
        bankaccount ref = new bankaccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref); //���� �� ����(�޸� �ּ� ����)
    }
    public static void check(bankaccount acc){
        acc.checkMyBalance();
    }
}
