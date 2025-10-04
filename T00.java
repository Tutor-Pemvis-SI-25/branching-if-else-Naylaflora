//12S25060-NAYLA FLORA PANJAITAN 
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, jumlah, kali;

        x = input.nextInt();
        y = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (y % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (x > y) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (x < y) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (x % 2 == 0) {
            if (y % 2 == 0) {
                jumlah = x + y;
                System.out.println("Hasil penjumlahan: " + jumlah);
            } else {
                System.out.println("Berbeda jenis");
            }
        } else {
            if (y % 2 != 0) {
                kali = x * y;
                System.out.println("Hasil perkalian: " + kali);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
