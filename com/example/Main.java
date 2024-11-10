package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, tarih, muzik, kimya, turkce;
        Scanner fenn = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = fenn.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = fenn.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = fenn.nextInt();

        System.out.print("muzik notunuzu giriniz: ");
        muzik = fenn.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = fenn.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = fenn.nextInt();

        int cem = (mat + fizik + tarih + muzik + kimya + turkce);
        double netice = cem / 6.0;
        System.out.print("Ortalamaniz: " + netice);

        String sonuc = (netice >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}