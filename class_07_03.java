package project_practice.chap02.chap07;
//참조변수
//메소드를 호출하면서 인스턴스의 참조 값을 전달할 수 있다
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


public class class_07_03 {
    public static void main(String[] args) {
        bankaccount ref = new bankaccount();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref); //참조 값 전달(메모리 주소 전달)
    }
    public static void check(bankaccount acc){
        acc.checkMyBalance();
    }
}
