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
    
    //Primer regla de las excepciones 
    //Un bloque trycatch tiene una llave de apertura y una llave de cierre 
    //dentro de su cuerpo puede contener uno o mas renglones que lancen excepciones 
    
    //Segunda regla 
    //Despues del try inmediatamente sigue el bloque catch puede haber tantos catch como excepciones
    //se lancen en el try
    
    //Tercera regla 
    //Puede ponerse un solo catch con una referncia exception y ella se hace cargo 
    //de cualquier numero de excepciones que podrian tenerse en el try
    
    //Cuarta regla 
    //ES conveniente cerrar el codigo de excepciones con un bloque catch 
    //que tenga una referencia de exception(mama) seguido de un finally 
    public static void main(String[] args) {
        
        File f=new File("/home/mario/Escritorio/Archivaldo");
        try {
            int x=2;
            int y=0;
            int div=x/y; 
            FileInputStream fis=new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new StringBuilder();
            
            while((ch=fis.read())!=-1){
                builder.append((char)ch);
                
            }
            System.out.println("Se leyo bien y se encontro esto: "+builder.toString());
        } catch (FileNotFoundException ex) {
            
            System.out.println("Checa el nombre de tu archivo");
            
        }catch(IOException ex){
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            
        }
        
        
    }
    
}
