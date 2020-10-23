package klinikkodingbcc1;

import java.util.Scanner;

/**
 *
 * @author Ibrahimsyah Z
 */
public class KlinikKodingBCC1 {

    public static void main(String[] args) {

        //Data Type
        int angka;
        int a = 6;
        double b = 2.1;
        float c = 3.2f;
        String d = "Halo";
        char e = 'E';

        int[] array = new int[5];

        int f = a;

        array[0] = 10;
        int[] array1 = array;

        int[] array2 = new int[5];
        array1[0] = 20;

        System.out.println(array[0]);
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        //Input Output
        Scanner input = new Scanner(System.in);
        int umur;
        String nama;

        System.out.print("Lalu siapakah namamu? ");
        nama = input.nextLine();

        System.out.print("Hei User, Umurmu berapa? ");
        umur = input.nextInt();

        System.out.printf("Hei %s, kamu berumur %d tahun!", nama, umur);
        //Seleksi Kondisi

        System.out.print("Masukkan angka anda: ");
        angka = input.nextInt();

        // If else
        if (angka < 50) {
            System.out.println("Angkamu kurang dari 50");
        } else if (angka < 80) {
            System.out.println("angkamu kurang dari 80");
        } else {
            System.out.println("Angkamu diluar jangkauan");
        }

        System.out.println("Selamat angkamu kurang dari 100");

        // Switch Case
        switch (angka) {
            case 100:
                System.out.println("Halo angkamu 100");
            case 80:
                System.out.println("Halo angkamu 80");
            case 50:
                System.out.println("Halo angkamu 50");
            default:
                System.out.println("Halo angkamu diluar jangkauan");
        }
        // Conditional Assigment / Ternary Operator

        System.out.print("Masukkan angka anda: ");
        angka = input.nextInt();

        //apakah angka yang diinputkan user kurang dari 100 ?
        // kondisi ? jikaBenar : jikaSalah
        String hasil = angka < 50 ? "Angkamu kurang dari 50" : "";
        System.out.println(hasil);

        double g = 5.9;
        int h = (int) g;

    }
}
