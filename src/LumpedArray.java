import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];

        Scanner input = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.print("Enter Array1 Element " + (i + 1) + ": ");
            array1[i] = input.nextInt();
            i++;
        }

        int j = 0;
        while (j < 4) {
            System.out.print("Enter Array2 Element: " + (j + 1) + ":");
            array2[j] = input.nextInt();
            j++;
        }

        for (i = 0 ; i < array1.length ; i++){
            array3[i] = array1[i];
        }
        for (j = 0 ; j < array2.length ; j++){
            array3[(array1.length + j)] = array2[j];
        }
        System.out.println("Show Element Array 3: ");
        for (int k = 0 ; k < array3.length ; k++){
            System.out.print(array3[k] + " ");
        }
    }
}
