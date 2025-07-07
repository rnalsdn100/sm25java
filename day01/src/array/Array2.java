package array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String[] strs = new String[3];
        // 3번 문자를 입력받아 배열을 출력하시오
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 문자 입력: ");
            strs[i] = sc.nextLine();
        }
        System.out.println("입력한 문자열:");
        for (int i = 0; i < 3; i++) {
            System.out.println(strs[i]);
        }
        sc.close();

    }
}