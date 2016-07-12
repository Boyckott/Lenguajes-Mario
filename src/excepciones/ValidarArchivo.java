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
public class ValidarArchivo {
 
    public static void validarExtencion(String extencion)throws ArchivoNoTxtException{
        if(!extencion.equals("txt"))throw new ArchivoNoTxtException();
    }
    
}
