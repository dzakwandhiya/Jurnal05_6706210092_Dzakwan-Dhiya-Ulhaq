package com.company;
import java.util.Scanner;
// Referensi :
// http://www.w3big.com/id/java/data-intopost.html

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        String masukkan = input.next();
        String keluaran;

        InfixToPostfix hasil = new InfixToPostfix(masukkan);
        keluaran = hasil.doTrans();
        System.out.println(keluaran);

    }
}
