/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.Serializable;

/**
 *
 * @author mario
 */
public class ProbarThreads implements Runnable{
    
    public static void main(String[] args) {
        //Creamos un thread 
        PrimerThread t1=new PrimerThread();
        t1.start();
        
        //Creamos el segundo thread
        Runnable r=new ProbarThreads();
        Thread t2=new Thread(r);
        t2.start();
    }
    
    public void run(){
        System.out.println("Segundo thread");
}
    
}
