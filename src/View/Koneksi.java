/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;

/**
 *
 * @author AbasZ
 */
public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
            try{
                String url = "jdbc:mysql://localhost:3306/db_ApkAperta";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            }catch (Exception e){
                System.err.println("Koneksi Gagal : " + e.getMessage());
            }
        return koneksi;
    }
    
    public static void main(String[] args) {
        getKoneksi();
    }
}
