package control;

public class Control4 {
    public static void main(String[] args) {
        // 1~10까지 짝수의 합과 평균
        // for문
        int a = 0;
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        for(int i=1;i<=10;i++){
            if (i % 2 == 0) {
                sum += i;
                cnt++;
            }
        }
        avg = Double.valueOf(sum)/cnt;
        System.out.printf("%d, %5.2f", sum, avg);
    }
}
