package project_practice.chap02.chap07;


//c����� ����ü��� �� �� �� ����
//�ν��Ͻ� == ��ü
//Ŭ���� = ������ + ��� == Ʋ
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



public class class_07_01 
{
    public static void main(String[] args) 
    {
        //�� ���� �ν��Ͻ� ����
        bankaccount yoon = new bankaccount();
        bankaccount park = new bankaccount();
        
        //�� �ν��Ͻ��� ������� ������ ����
        yoon.deposit(5000);
        park.deposit(3000);

        //�� �ν��Ͻ��� ������� ����� ����
        yoon.withdraw(2000);
        park.withdraw(2000);

        //�� �ν��Ͻ��� ������� �ܾ��� ��ȸ
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
    
}
