/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposDatos;

/**
 *
 * @author mario
 */
public class Tipos1 {
    
    public static void main(String[] args){
        //Declaramos un byte 
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        b=(byte)s;
        s=b;
        l=i;
        i=s;
        l=b;
        s=(short)l;
        i=b;
        
        Operaciones o=new Operaciones();
        System.out.println(o.suma((float)4.0, 5.0F));
    }
    
}
