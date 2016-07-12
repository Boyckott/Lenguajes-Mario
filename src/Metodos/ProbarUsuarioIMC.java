/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author mario
 */
public class ProbarUsuarioIMC {
    public static void main(String[] args) {
        UsuarioIMC a1=new UsuarioIMC();
        a1.setPeso(70);
        
        OperacionesUsuariosIMC o=new OperacionesUsuariosIMC();
        System.out.println("Tu IMC es "+ o.calcularIMC(a1));
        
        
        
    }
    
}
