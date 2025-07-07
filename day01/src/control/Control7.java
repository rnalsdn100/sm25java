package control;
import java.util.Scanner;
import java.util.Random;
public class Control7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        while(true){
            System.out.println("\nEnter command:(arr1, arr2, arr3)");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("종료합니다");
                break;
            } else if(cmd.equals("arr1")){
                // 1~10 까지의 숫자를 하나 입력받는다
                System.out.println("Enter Num1(1~10):");
                String num1 = sc.nextLine();
                System.out.println("Enter Num2(1~10):");
                String num2 = sc.nextLine();
                System.out.printf("Input Number %s %s \n",num1,num2);
                int n1=Integer.parseInt(num1);
                int n2=Integer.parseInt(num2);
                System.out.printf("Add: %d \n",n1+n2);

            } else if(cmd.equals("arr2")){
                // 한개의 1~10까지의 숫자를 입력받는다
                // 해당 사이즈의 1차원 배열을 생성한다
                // 배열에 랜덤하게 1~10 까지의 값을 입력한다 중복 X
                // 1. 배열값을 출력
                // 2. 배열값의 합과 평균을 출력
                // 3. 최대, 최소값 출력
                System.out.println("Enter Num1(1~10):");
                String num1 = sc.nextLine();
                int n1 =  Integer.parseInt(num1);
                int arr2[] = new int[n1];

                // 1. 랜덤값으로 배열 채우기 중복X
                for(int i=0;i<arr2.length;i++){
                    int rNum = rand.nextInt(10) + 1;
                    boolean flag = false;

                    for(int j=0;j < i; j++){
                        if(arr2[j] == rNum){
                            flag = true;
                            break;
                        }
                    }
                if(flag){
                    i--;
                } else{
                        arr2[i] = rNum;
                        System.out.printf(arr2[i] + " ");
                    }
                }
                System.out.println();
                // 합과 출력 구문
                int sum = 0;
                for(int i=0; i<arr2.length;i++){
                    sum += arr2[i];
                }
                double avg = sum/(double)arr2.length;

                // min, max 값 찾기
                int max = arr2[0];
                int min = arr2[0];
                for(int i=1; i<arr2.length;i++){
                    if(arr2[i] > max) max = arr2[i];
                    if(arr2[i] < min) min = arr2[i];
                }
                System.out.println("배열 전체 합: "+sum);
                System.out.println("배열 전체 평균: "+avg);
                System.out.println("배열의 최대값: "+max);
                System.out.println("배열의 최소값: "+min);

            } else if(cmd.equals("arr3")){
                // 두개의 1~5까지의 숫자를 입력받는다
                // 해당 사이즈의 2차원 배열을 생성한다
                // 배열에 랜덤하게 1~50까지의 값을 입력한다. 중복되지않게 입력
                // 1.배열값을 출력하고
                // 2.배열값의 합과 평균을 출력
                // 3. 최대, 최소 값 출력
                System.out.println("Enter Num1(1~5):");
                String num1 = sc.nextLine();
                System.out.println("Enter Num2(1~5):");
                String num2 = sc.nextLine();
                int n1=Integer.parseInt(num1);
                int n2=Integer.parseInt(num2);
                int arr3[][] = new int[n1][n2];
                Random rand2 = new Random();
                for(int i=0;i<arr3.length;i++){
                    for(int j=0;j<arr3[i].length;j++){
                        int rNum = rand2.nextInt(50) + 1;
                        if(i ==0 && j == 0){
                            arr3[i][j]=rNum;
                        } else{
                            boolean flag = true;
                            // rNum이 배열에 있으면 다시 랜덤변수 생성
                            point:
                            for(int k=0;k<=i;k++){
                                for(int n:arr3[k]){
                                    if(n == rNum){
                                        flag = false;
                                        break point;
                                    }
                                }

                            }
                            if(!flag){
                                j--;
                            }else{
                                arr3[i][j]=rNum;
                            }
                        }
                    }

                }
                // 배열 출력하기
                for(int i=0;i<arr3.length;i++){
                    for(int j=0;j<arr3[i].length;j++){
                        System.out.print(arr3[i][j]+" ");
                    }
                    System.out.println();
                }
                // 합과 평균
                int sum = 0;
                int count = 0;

                for(int i=0;i<arr3.length;i++){
                    for(int j=0;j<arr3[i].length;j++){
                        sum += arr3[i][j];
                        count++;
                    }
                }
                double avg = sum/(double)count;
                System.out.println("배열 전체 합: " + sum);
                System.out.println("배열 전체 평균: " + avg);
                // min 과 max 값 구하기
                int max = arr3[0][0];  // 배열의 첫 번째 값을 기준으로 시작
                int min = arr3[0][0];

                for (int i = 0; i < arr3.length; i++) {
                    for (int j = 0; j < arr3[i].length; j++) {
                        if (arr3[i][j] > max) max = arr3[i][j];  // 더 크면 max 갱신
                        if (arr3[i][j] < min) min = arr3[i][j];  // 더 작으면 min 갱신
                    }
                }
                System.out.println("최대값: " + max);
                System.out.println("최소값: " + min);


            } else{
                System.out.println("Invalid Command ");
            }
        }
        sc.close();


    }
}