/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.perpustakaan;
import java.util.Scanner;
/**
 *
 * @author zamza
 */
public class adminLogin {
    public static void login(String[] args) {
        // Username dan password yang diizinkan
        String allowedUsername = "admin";
        String allowedPassword = "admin";

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String enteredPassword = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai
        if (enteredUsername.equals(allowedUsername) && enteredPassword.equals(allowedPassword)) {
            System.out.println("Login berhasil. Selamat datang, " + allowedUsername + "!");
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }
    
}
