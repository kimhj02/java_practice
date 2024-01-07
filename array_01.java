package chap13;

class Box{
    private String conts;

    Box(String cont){this.conts = cont;}
    public String toString()
    {
        return conts;
    }
}


public class array_01 {
    public static void main(String[] args) {
        int[] ref = new int[5];
        
        double[] ref2 = new double[7];

        float[] ref3;
        ref3 = new float[9];

        System.out.println(ref.length);
        System.out.println(ref2.length);
        System.out.println(ref3.length);
        Box[] ar = new Box[5];
        System.out.println("±Ê¿Ã : " + ar.length);
    }
}
