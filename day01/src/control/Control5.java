package control;

public class Control5 {
    public static void main(String[] args){
        // 1~10까지 짝수의 합과 평균
        // while 문

        int i = 1;
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        while(i <= 10){
            if(i % 2 == 0){
                sum += i;
                count++;
            }
            i++;
        }
        avg = sum*1.0 / count;

        System.out.printf("%d, %5.2f", sum, avg);


    }
}
