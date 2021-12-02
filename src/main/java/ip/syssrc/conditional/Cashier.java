package ip.syssrc.conditional;

/**
 * Cashier
 *
 * Assignment 1.1
 *
 * @author H071211051 - Febi Fiantika <febifian23@gmail.com>
 *
 */
import java.util.*;
import java.util.InputMismatchException;
public class Cashier {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
<<<<<<< HEAD
<<<<<<< HEAD
        int totalBelanja = 0;
        int jumlahBayar = 0;
        int kembalian = 0;
=======
        int totalBelanja, jumlahBayar;
>>>>>>> 831a788 (feat(conditional/Cashier): add 'TryCatch' object)
        try {
            System.out.println("Total Belanja : ");
            totalBelanja = in.nextInt();
            System.out.println("Jumlah yang dibayarkan : ");
            jumlahBayar = in.nextInt();
            in.close();
<<<<<<< HEAD
        } catch (Exception e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            return;
        } 
        if (jumlahBayar > totalBelanja) {
            kembalian = jumlahBayar - totalBelanja;
            System.out.println("Total Kembalian : " + kembalian);
            System.out.println("Dengan rincian sebagai berikut : ");

        }
        if (kembalian >= 100000) {
            int pecahan = (kembalian / 100000);
            kembalian -= (100000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 100.000");

        }
        if (kembalian >= 50000) {
            int pecahan = (kembalian / 50000);
            kembalian -= (50000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 50.000");

        }
        if (kembalian >= 20000) {
            int pecahan = (kembalian / 20000);
            kembalian -= (20000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 20.000");
            
        }
        if (kembalian >= 10000) {
            int pecahan = (kembalian / 10000);
            kembalian -= (10000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 10.000");

        }
        if (kembalian >= 5000) {
            int pecahan = (kembalian / 5000);
            kembalian -= (5000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 5.000");

        }   
        if (kembalian >= 2000) {
            int pecahan = (kembalian / 2000);
            kembalian -= (2000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 2.000");

        }
        if (kembalian >= 1000) {
            int pecahan = (kembalian / 1000);
            kembalian -= (1000 * pecahan);
            System.out.println(pecahan + " lembar uang Rp. 1.000");

        }
        if (kembalian >= 500) {
            int pecahan = (kembalian / 500);
            kembalian -= (500 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 500");

        }
        if (kembalian >= 200) {
            int pecahan = (kembalian / 200);
            kembalian -= (200 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 200");

        }
        if (kembalian >= 100) {
            int pecahan = (kembalian / 100);
            kembalian -= (100 * pecahan);
            System.out.println(pecahan + " buah uang Rp. 100");

        }
=======
        System.out.println("Total Belanja : ");
        int totalBelanja = in.nextInt();
        System.out.println("Jumlah yang dibayarkan : ");
        int jumlahBayar = in.nextInt();
=======
        } catch (InputMismatchException e) {
            System.out.println("Maaf, pastikan inputan anda adalah angka");
            return;
        } 
        
>>>>>>> 831a788 (feat(conditional/Cashier): add 'TryCatch' object)
        int kembalian = jumlahBayar - totalBelanja;
        System.out.println("Total Kembalian : " + kembalian);
        System.out.println("Dengan rincian sebagai berikut : ");
        int a,b,c,d,e,f,g,h,i,j;

        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;

        if (kembalian >= 100000) {
            kembalian = kembalian - 100000;
            a = a + 1;
        }
        if (kembalian >= 50000) {
            kembalian = kembalian - 50000;
            b = b + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c = c + 1;
        }
        if (kembalian >= 20000) {
            kembalian = kembalian - 20000;
            c = c + 1;
        }
        if (kembalian >= 10000) {
            kembalian = kembalian - 10000;
            d = d + 1;
        }
        if (kembalian >= 5000) {
            kembalian = kembalian - 5000;
            e = e + 1;
        }   
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f = f + 1;
        }
        if (kembalian >= 2000) {
            kembalian = kembalian - 2000;
            f = f + 1;
        }
        if (kembalian >= 1000) {
            kembalian = kembalian - 1000;
            g = g + 1;
        }
        if (kembalian >= 500) {
            kembalian = kembalian - 500;
            h = h + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i = i + 1;
        }
        if (kembalian >= 200) {
            kembalian = kembalian - 200;
            i = i + 1;
        }
        if (kembalian >= 100) {
            kembalian = kembalian - 100;
            j = j + 1;
        }
        if (a > 0) {
            System.out.println(a + " lembar uang Rp.100000");
        } 
        if (b > 0) {
            System.out.println(b + " lembar uang Rp.50000");
        } 
        if (c > 0) {
            System.out.println(c + " lembar uang Rp.20000");
        } 
        if (d > 0) {
            System.out.println(d + " lembar uang Rp.10000");
        } 
        if (e > 0) {
            System.out.println(e + " lembar uang Rp.5000");
        } 
        if (f > 0) {
            System.out.println(f + " lembar uang Rp.2000");
        } 
        if (g > 0) {
            System.out.println(g + " lembar uang Rp.1000");
        } 
        if (h > 0) {
            System.out.println(h + " buah uang Rp.500");
        } 
        if (i > 0) {
            System.out.println(i + " buah uang Rp.200");
        } 
        if (j > 0) {
            System.out.println(j + " buah uang Rp.100");
        }
        if (kembalian > 0) {
            System.out.println("Rp. " + kembalian + " didonasikan");
        }

        
        in.close();
>>>>>>> f7b9840 (feat(conditional/Cashier): add 'java.util.Scanner' object)
    }
}
