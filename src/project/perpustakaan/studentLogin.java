/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.perpustakaan;
import java.util.Scanner;
/**
 *
 * @author zamza
 */
public class studentLogin {
    public static void login(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan string dengan 15 digit angka: ");
        String input = scanner.nextLine();

        // Memeriksa apakah panjang string tepat 15 karakter
        if (input.length() != 15) {
            System.out.println("Error: String harus terdiri dari 15 digit angka.");
            return;  // Keluar dari program
        }

        // Memeriksa apakah semua karakter adalah digit
        if (!input.matches("\\d+")) {
            System.out.println("Error: String harus terdiri dari digit angka.");
            return;  // Keluar dari program
        }

        // Jika lolos semua pemeriksaan, cetak hasilnya
        System.out.println("Input yang valid: " + input);
    }
}
