/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Masukkan nama mahasiswa: ");
    String namaMahasiswa = scanner.nextLine();
    System.out.println("Masukkan alamat mahasiswa: ");
    String alamatMahasiswa = scanner.nextLine();

    System.out.println("Masukkan jumlah kursus yang diambil: ");
    int jumlahKursus = scanner.nextInt();

    // Membersihkan baris baru yang tersisa di buffer
    scanner.nextLine();

    // Membuat array untuk nilai dan kursus
    int[] nilaiKursus = new int[jumlahKursus];
    String[] namaKursus = new String[jumlahKursus];

    // Mengisi informasi untuk setiap kursus
    for (int i = 0; i < jumlahKursus; i++) {
        System.out.println("Masukkan nama kursus ke-" + (i + 1) + ": ");
        namaKursus[i] = scanner.nextLine();

        System.out.println("Masukkan nilai untuk kursus " + namaKursus[i] + ": ");
        nilaiKursus[i] = scanner.nextInt();

        // Membersihkan baris baru yang tersisa di buffer
        scanner.nextLine();
    }

    // Membuat objek Student dengan informasi yang dimasukkan pengguna
    Student mahasiswa = new Student(namaMahasiswa, alamatMahasiswa, jumlahKursus, nilaiKursus, namaKursus);

    // Mencetak informasi mahasiswa
    System.out.println(mahasiswa);

    }
}
