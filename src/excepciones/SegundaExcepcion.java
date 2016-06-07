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

//Aqui usaremos las excepciones de tipo checked en las que tu tienes que hacer cargo de ellas
//Vamos a usar un paquete que no se encuentra por defecto tienes que agregarlo con import

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SegundaExcepcion {
    //Investigar que significa el bloque try catch 
    //contrastarlo con el throws
    public static void main(String[] args) {
        
        File f=new File("D:\\Archivaldo");
        try {
            FileInputStream fis=new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            
        }
        
        
    }
    
}
