package ip.syssrc.array;

/**
 * SumOneThird
 *
 * Assignment 3.3
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
 *
 */
public class SumOneThird {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int sum = 0;
        for (int index = 0; index < (arr.length / 3); index++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                int deret = index + (j * (arr.length/3));
                sum = sum + arr[deret];
            }
        }
        
    }
}
