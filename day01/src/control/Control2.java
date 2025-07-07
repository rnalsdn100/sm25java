package control;

public class Control2 {
    public static void main(String[] args){
        // 1~10까지의 합과 평균을
        // for문을 이용하여 구하시오
        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        for(int a=1;a<=10;a++){
            sum += a;
            cnt++;
        }
        // avg = sum / (double)cnt;
        avg = Double.valueOf(sum)/cnt;

        System.out.println("합= " + sum);
        System.out.println("평균= " + avg);
        System.out.printf("%d, %5.2f", sum, avg);
    }
}
