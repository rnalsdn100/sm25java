package array;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
public class Array1 {
    public static void main(String[] args){
        // Reference Type...
        Random rand = new Random();
        int [] arr = new int[10];
        int arr2[] = new int[10];
        int[] arr3 = {1,2,3,4,5};

        for(int i=0;i<5;i++){
            arr[i] = rand.nextInt(10) + 1;
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

