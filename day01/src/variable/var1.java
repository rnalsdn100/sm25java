package variable;

public class var1 {
    public static void main(String[] args){
        // 정수는 int
        int inputNum = 10; // 32bit 4byte
        long longnum = 2100000000L;// 64bit 8byte

        byte b1 = 100;
        byte b2 = 100;
        byte b3 = (byte) (b1 + b2);
       // System.out.println(b3);



        float f1 = 100000000.0F;
        float f2 = 100000000.0F;
        float f3 = f1 + f2;
        System.out.printf("%f", f3);
        double d1 = 1000000.0;
    }
}
