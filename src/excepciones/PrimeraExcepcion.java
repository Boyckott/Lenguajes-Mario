/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-107
 */

//¿Que es una excepcion en java?
//-Es un error en tiempo de ejecucion 
//Las excepciones en java son de 2 tipos 
//Checked exception: Te haces cargo de ellas con codigo 
//Unchecked exception:No tienes que hacerte cargo de ellas, el compilador te ayuda 

public class PrimeraExcepcion {
   
    public static void main(String[] args) {
        //Veremos primero las mas comunes de las unchecked 
        
        float x=4;
        int y=0;
        System.out.println(x/y);
        System.out.println("Este es antes de la excepxion");
        String falsoNumero="5";
        int numeroReal=5;
        int suma=Integer.parseInt(falsoNumero)+numeroReal;
        System.out.println("Todo esta bien hasta aqui");
        if(true){
            System.out.println("Siempre aparecere");
        }
        System.out.println("La ejecucion siempre pasa aqui se ejecute o mo el if");
    }
    
}
