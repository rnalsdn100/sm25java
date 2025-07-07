package array2;

import java.util.Arrays;
import java.util.Random;

public class Array3 {
    public static void main(String[] args){
        // 5행 5열의 배열에
        // 1~100까지 random 숫자 입력
        // 단 중복 X
        int arr [][] = new int[5][5];
        Random rand = new Random();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int num = rand.nextInt(100) + 1;
                boolean dupulicate = false;

                for(int r=0;r<5;r++){
                    for(int k=0;k<5;k++){
                        if(arr[r][k] == num){
                            dupulicate = true;
                            break;
                        }
                        if(dupulicate){
                            break;
                        }
                         if(dupulicate){
                             j--;
                         }
                         else{
                             arr[i][j] = num;
                         }
                }
            }
            }
        }
        System.out.println("===== 배열 내용 =====");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println(); // 줄바꿈
        }


    }
}
