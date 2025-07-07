package array2;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args){
        int arr[][] = new int[5][5];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = rand.nextInt(100) + 1;

            }

        }
    }
}
