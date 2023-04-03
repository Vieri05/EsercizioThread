/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eserciziothread;

/**
 *
 * @author User
 */
public class MyThread extends Thread{
  
    private int Val;

    public MyThread(String name, int val) {
        super(name);
        Val = val;
    }

    @Override
    public void run() {
        int result = 1;

        for (int i = 1; i <= this.getVal(); i++){
            result = i * result;
        }
        Val = result;
    }

    public void setVal(int val) {
        Val = val;
    }

    public int getVal() {
        return Val;
    }
}
    

