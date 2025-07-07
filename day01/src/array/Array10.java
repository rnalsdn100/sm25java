package array;

import java.util.Arrays;
import java.util.Random;
public class Array10 {
    public static void main(String[] args){
        //5개에 배열에 1~10까지의 숫자를 랜덤하게 입력하세요
        //단, 중복되지 않게 입력 하세요
        //전체 배열을 출력 하시오
        //배열에 최대, 최소 값을 출력 하시오

        int [] arr1 = new int[5];
        Random rand = new Random();

        for(int i=0;i<5;i++){
            int check = rand.nextInt(10) + 1;
            boolean duplicate = false;

            for(int j=0;j < i; j++){
                if(arr1[j] == check){
                    duplicate = true;
                    break;
                }

                }
            if(duplicate){
                i--;
            }
            else{
                arr1[i] = check;
            }
            }
        System.out.println(Arrays.toString(arr1));

        int min = 0;
        int max = 0;

        for(int i = 1; i < arr1.length; i++) {
            if(arr1[i] > max) max = arr1[i];
            if(arr1[i] < min) min = arr1[i];
        }
        System.out.println(min);
        System.out.println(max);
        }

}



