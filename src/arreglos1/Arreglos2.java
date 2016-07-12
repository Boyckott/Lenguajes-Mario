/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos1;

/**
 *
 * @author T-107
 */
public class Arreglos2 {
    public static void main(String[] args) {
        
        int arreglo1[]=new int[3];
        arreglo1[0]=34;
        arreglo1[1]=-23;
        arreglo1[2]=180;
        
        for(int i=0;i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }
        
        //Iteraremos el mismo arreglo pero con un ciclo for mejorado 
        //enhaced for 
        
        for(int x:arreglo1){
            System.out.println(x);
        }
        
    }
    
}
