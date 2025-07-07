package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Input num == ");

        Scanner sc = new Scanner(System.in);
        int num = 0;
        try{
            num = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.printf("Invalid Input");
        }
        int a[] = null;
        try{
            a = new int[num];

        }catch(Exception e){
            System.out.println("음수 안됩니다.");
            return;
        }

        for(int i =0; i< a.length; i++){
            System.out.printf("%d", a[i]);
        }
    }
}
