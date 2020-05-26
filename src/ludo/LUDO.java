/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.ImageIcon;
/**
 *
 * @author Admin
 */
public class LUDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       
       
       LudoInterface obj=new LudoInterface();
       obj.setVisible(true);
       obj.setLocation(450, 75);
         ImageIcon obj4=new ImageIcon("ludoicon1.png");
         obj.setIconImage(obj4.getImage());
  PlayFrame sc1=new PlayFrame();
        try{
            for(int q=0;q<=100;q++){
               Thread.sleep(40);
               obj.bar.setValue(q);
               obj.progress.setText("     "+Integer.toString(q)+"%");
               
            }
        }catch(Exception e){
            
        }
        new LudoInterface().setVisible(false);
        sc1.setVisible(true);
        sc1.setIconImage(obj4.getImage());
        obj.dispose();
        
        
    }
       
       
    }
    

