package klinikkodingbcc;

import java.util.Scanner;

public class MethodKlinikKoding {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println();

//        tampilkanHelloWorld();

//        int hasilPenjumlahan = penjumlahan2Number(); // 8
//        System.out.println(hasilPenjumlahan);

//        int bil1 = in.nextInt();
//        int bil2 = in.nextInt();
//        int hasilPengurangan = pengurangan2Number(bil1, bil2); // 3
//        System.out.println(hasilPengurangan);

//        int hasilRekursif = rekursif(1, 5);
//        System.out.println(hasilRekursif);

        // Jawaban soal 1
        int[] arr = {3, 1, 4, 6, 8, 2};
        printArray(arr);
        System.out.println("");

        // Jawaban soal 2
        swap(arr, 3, 5);
        System.out.println("");

        // Jawaban soal 3
        int hasilPerkalian = kaliArray(arr);
        System.out.println(hasilPerkalian);

        // Jawaban soal 4
        arr = reverse(arr);
        for (int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println("");

        // Jawaban soal 7
        int hasilFaktorial = faktorial(3); // = 6
        System.out.println(hasilFaktorial);
    }

    /*
    Apa yang akan dipelajari?
    1. Pengertian singkat -> blok program yg terpisah dan dibuat untuk tugas tertentu.
            penjumlahan();
            tampilkanHurufA();

    2. Method void -> method yg tidak mengembalikan nilai ketika dipanggil.
            modifier? static? void namaMethod(parameter?) {
                statement;
            }

    3. Method return value -> method yg mengembalikan nilai ketika dipanggil.
            modifier? static? returnType namaMethod(parameter?) {
                statement;
                return ..;
            }

    4. Pass by reference and value (Method ber-parameter)

    5. Rekursif method -> method yg memanggil diri sendiri.

    6. Overload method -> konsep java dimana method boleh memiliki nama sama
                          tapi parameter harus beda.
    */

    // Contoh method void
    public static void tampilkanHelloWorld() {
        System.out.println("Hello World!");
    }

    // Contoh method return value
    public static int penjumlahan2Number() {
        int result = 3 + 5; // 8
        return result;
    }

    // Contoh method dengan parameter
    public static int pengurangan2Number(int num1, int num2) {
        return num1 - num2; // 5 - 2 = 3
    }

    // Contoh method Rekursif
    public static int rekursif(int bil1, int bil2) { // 1 dan 5 -> 2 dan 5 -> 3 dan 5
        if (bil1 == bil2) return bil1;
        else {
            return (bil1 + rekursif(bil1+1, bil2)); // 1 + 2 + 3 + 4 + 5 = 15
        }
    }

    // Contoh Overload method
    public static int a(int b){return 0;}
    public static int a(int b, int c){return 0;}

    /*
    Contoh kasus:
    1. Tampilkan semua element array -> printArray(int[] array) : void
    2. Swap element array -> swap(int[] array, int index1, int index2) : void
    3. Kalikan semua element di dalam array -> kaliArray(int[] array) : int
    4. Reverse element array -> reverse(int[] array) : int[]
    5. By Reference, modifikasi nilai array bedasar index -> modify(int index, int value) : void
    6. By Value, penjumlahan 2 bilangan -> penjumlahan(int num1, int num2) : int
    7. Faktorial -> faktorial(int num) : int
     */

    // Jawaban soal 1
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Jawaban soal 2
    public static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1]; // 6
        array[idx1] = array[idx2]; // 6 -> 2
        array[idx2] = temp; // 2 -> 6
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Jawaban soal 3
    public static int kaliArray(int[] array) {
        int result = 1;
        for (int value: array) {
            result *= value;
        }
        return result;
    }

    // Jawaban soal 4
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        int counter = array.length-1;
        for (int value: array) {
            result[counter] = value;
            counter--;
        }
        return result;
    }

    // Jawaban soal 7
    public static int faktorial(int num) { // 3, 2, 1
        if (num == 1) return num;
        else {
            return (num * faktorial(num-1)); // 3 * 2 * 1 = 6
        }
    }
}
