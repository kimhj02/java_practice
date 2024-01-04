package project_practice.chap02.chap07;


//c언어의 구조체라고 말 할 수 있음
//인스턴스 == 객체
//클래스 = 데이터 + 기능 == 틀
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



public class class_07_01 
{
    public static void main(String[] args) 
    {
        //두 개의 인스턴스 생성
        bankaccount yoon = new bankaccount();
        bankaccount park = new bankaccount();
        
        //각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        park.withdraw(2000);

        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
    
}
