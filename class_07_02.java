package project_practice.chap02.chap07;

//���� ������ Ư��

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


public class class_07_02 {
    public static void main(String[] args) {
        bankaccount ref1 = new bankaccount();
        bankaccount ref2 = ref1;    
        //ref1�� �����ϴ� ����� ref2�� ����
        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }
}
