package project_practice.chap02.chap07;

class bankaccount
{
    int balance = 0;    //���� �ܾ�
    String accnumber;
    String ssnumber;

//�ʱ�ȭ�� ���� METHOD ������
    public bankaccount(String acc, String ss, int bal) 
    {
        accnumber = acc;
        ssnumber = ss;
        balance = bal;
    }

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
        System.out.println("���¹�ȣ : " + accnumber);
        System.out.println("�ֹι�ȣ : " + ssnumber);
        System.out.println("�ܾ� : " + balance + '\n');
        return balance;
    }
}

public class string_07_05 
{
    public static void main(String[] args) 
    {
        bankaccount yoon = new bankaccount("02-02-22","222-222",10000);
        bankaccount park = new bankaccount("asdf","asdf",10000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
