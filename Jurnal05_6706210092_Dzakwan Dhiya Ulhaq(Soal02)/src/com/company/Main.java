package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ToDoList<String> queue = new ToDoList<>();
        Scanner input = new Scanner(System.in);
        int option = 0;
        System.out.println("Membuat Program To-Do List Sederhana");

        while(option != 4){
            System.out.println("1. Input to-do baru");
            System.out.println("2. Hapus to-do");
            System.out.println("3. Print to-do List");
            System.out.println("4. Keluar");
            option = input.nextInt();
            if(option == 1){
                System.out.println("Masukkan to-do:");
                String toDo = input.next();
                queue.enqueue(toDo);
                System.out.println();
            }
            else if(option == 2){
                queue.dequeue();
                System.out.println("To-do Pertama berhasil dihapus");
                System.out.println("Cetak to-do terkini ? (y/n):");
                String option2 = input.next();
                while (!option2.equals("y") || !option2.equals("n")){
                    if(option2.equals("y")){
                        System.out.println("List to-do yang belum diselesaikan:");
                        queue.print();
                        System.out.println();
                        break;
                    }
                    else if(option2.equals("n")){
                        System.out.println();
                        break;
                    }
                }

            }
            else if(option == 3){
                System.out.println("List to-do yang belum diselesaikan:");
                queue.print();
                System.out.println();

            }
        }


    }
}
