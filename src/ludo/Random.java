/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

/**
 *
 * @author Admin
 */
public class Random {
    private int number;
    Random(){
         number = (int)(Math.random() * 6 + 1);
      
    }
    public  int getnumber(){
       return number;
    }
}
