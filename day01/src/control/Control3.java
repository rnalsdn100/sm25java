package control;

public class Control3 {
    public static void main(String[] args){
        // 1~10까지 합과 평균 구하기
        // while
        int i = 1;
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        while(i <= 10){
            sum += i;
            i++;
        }
        avg = sum / (double)i;

        System.out.printf("%d, %5.2f", sum, avg);

    }
}
