package chap20;



public class Math_01 {
    public static void main(String[] args) {
        System.out.println("������ : " +Math.PI);
        System.out.println("2�� ������ : " + Math.sqrt(2));
        System.out.println();
        System.out.println("���̿� ���� degree : " + Math.toDegrees(Math.PI));
        System.out.println("2 ���̿� ���� degree : " + Math.toDegrees((2.0*Math.PI)));
        System.out.println();
        
        double radian45 = Math.toRadians(45); //�������� ��ȯ
        System.out.println("sin 45 : " + Math.sin(radian45));
        System.out.println("cos 45 : " + Math.cos(radian45));
        System.out.println("tan 45 : " + Math.tan(radian45));
        System.out.println();

        System.out.println("�α� 25 : " + Math.log(25));
        System.out.println("2�� 16���� : " + Math.pow(2,16));

        
    }
}
