package project_practice.chap02.chap05;

public class loop_05_02 {
    public static void main(String[] args) 
    {
        //switch¿Í break
        int n = 3;

        switch(n){
            case 1:
                System.out.println("simple java");
            case 2:
                System.out.println("funny fava");
            case 3:
                System.out.println("fantastic java");
            default:
                System.out.println("the best programming language");

        }
        System.out.println("do you like java?");

        int num = 3;
        switch(num)
        {
            case 1:
                System.out.println("first");
                break;
            case 2:
                System.out.println("second");
                break;
            case 3:
                System.out.println("third");
                break;
            default:
                System.out.println("end");    
        }
        System.out.println("do you like java?");

        int num1 = 1;
        switch(num1)
        {
            case 1:
            case 2:
            case 3:
                System.out.println("one two three");
                break;
            default:
                System.out.println("end");    
        }
        System.out.println("do you like java?");
        
    }

}
