/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eserciziothread;

/**
 *
 * @author User
 */
public class EsercizioThread {

    public static void main(String[] args) throws InterruptedException {
        
        MyThread f1 = new MyThread("Fattoriale 1", 6);
        MyThread f2 = new  MyThread("Fattoriale 2", 10);
        MyThread f3 = new MyThread("Fattoriale 3", 10-5);
        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();
        System.out.println("Combinazioni (n,k) = " + f1.getVal() / (f2.getVal() * f3.getVal()));
      
    }
}
