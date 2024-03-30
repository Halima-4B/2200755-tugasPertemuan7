package tugas7;

import java.util.Scanner;

public class pertemuan7{
    private double a, b, c, d, e, f;

    // Konstruktor untuk menginisialisasi koefisien dengan nilai default
    public pertemuan7(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }

    // Getter untuk koefisien a
    public double getA(){
        return a;
    }

    // Getter untuk koefisien b
    public double getB(){
        return b;
    }

    // Getter untuk koefisien c
    public double getC(){
        return c;
    }

    // Getter untuk koefisien d
    public double getD(){
        return d;
    }

    // Getter untuk koefisien e
    public double getE(){
        return e;
    }

    // Getter untuk koefisien f
    public double getF(){
        return f;
    }

    // Method untuk mengatur nilai koefisien
    public void setKoefisien (double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Method untuk memeriksa apakah persamaan linier solvable
    public boolean isSolvable(){
        return (a * d - b * c) != 0;
    }
    
    // Method untuk menghitung nilai x
    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }

    // Method untuk menghitung nilai y
    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai-nilai koefisien
        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = scanner.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = scanner.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = scanner.nextDouble();

        // Membuat objek persamaan linier
        pertemuan7 equation = new pertemuan7();
        equation.setKoefisien (a, b, c, d, e, f);

        // Memeriksa dan menampilkan solusi persamaan linier
        if (equation.isSolvable()){
            System.out.println("Nilai x adalah: " + equation.getX());
            System.out.println("Nilai y adalah: " + equation.getY());
        } else{
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}