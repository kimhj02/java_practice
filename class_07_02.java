package project_practice.chap02.chap07;

//참조 변수의 특성

class bankaccount{
    int balance = 0;    //에금 잔액

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
        System.out.println("잔액 : " + balance);
        return balance;
    }
}


public class class_07_02 {
    public static void main(String[] args) {
        bankaccount ref1 = new bankaccount();
        bankaccount ref2 = ref1;    
        //ref1이 참조하는 대상을 ref2도 참조
        ref1.deposit(3000);
        ref2.deposit(2000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }
}
