package ip.syssrc.array;
import java.util.Scanner;
/**
 * CountEach
 *
 * Assignment 3.1
 *
 * @author H071211061 - St. Alya Ardani Aries <stalyaardaniaries@gmail.com>
 *
 */

public class CountEach {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] array = new int[10000000];
        
        for (int i = 0; i < n; i++) {
            int src = in.nextInt();
            array[src]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
            } else {
                System.out.println(array[i] + " Angka " + i);
            }
        }
        in.close();
    }
}