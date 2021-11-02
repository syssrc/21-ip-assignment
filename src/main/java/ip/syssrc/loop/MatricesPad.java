package ip.syssrc.loop;
import java.util.Scanner; 
/**
 * MatricesPad
 *
 * Assignment 2.1
 *
 * @author H071211079 - Dhiyaa Unnisa <unnisadhiyaa25@gmail.com>
 *
 */

public class MatricesPad {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();
        int size = in.nextInt();
        int awal = start;

        if (end >= start) {
            while(end >= start) {
                for(int i=0; i < size; i++) {
                    if (start == end) {
                        break;
                    }
                    if (start < 10) {
                        System.out.print("0" + start + " ");
                    } else {
                        System.out.print(start + " ");
                    }
                    start++;
                }
                if (start == end) {
                    if ((awal - end) % size == 0) {
                        if (start < 10) {
                            System.out.println("");
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println("");
                            System.out.println(start);
                            break;
                        }
                    } else {
                        if (start < 10) {
                            System.out.println("0" + start);
                            break;
                        } else {
                            System.out.println(start);
                            break;
                        }
                    }
                }
                System.out.println();
            }
        } 

        
    }
}
