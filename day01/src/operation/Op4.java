package operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 70;
        int c = 30;
        int x;
        int y;
        int max = 0;
        int min = 0;
        // 3수의 최대 값과 최소 값을 구하시오
        if (a > b && a > c){
            x = a;
        }
        else if (b > a && b > c){
            x = b;
        }
        else{
            x = c;
        }
        if (a < b && a < c){
            y = a;
        }
        else if (b < a && b < c){
            y = b;
        }
        else{
            y = c;
        }

        System.out.println("Max = " + x);
        System.out.println("Min = " + y);

        max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        min = (a < b) ? ((a < c) ? a : c) : ((b > c) ? b : c);
        System.out.printf("%d %d" ,max, min);
    }

}
