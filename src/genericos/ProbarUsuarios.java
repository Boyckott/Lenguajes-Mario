/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
        
    //Vamos a leer el arraylist a ver que hay 
    //paso 1 Ctreamos un objeto de la clase PersistenciaUsuario
    
    PersistenciaUsuario p=new PersistenciaUsuario();
    try{
        ArrayList<Usuario> usuarios= p.buscarTodos();
        int tam = usuarios.size();
        System.out.println("Usuarios Guardados: "+tam);
        System.out.println(usuarios.get(0).getNombre());
        }catch  (Exception ex){
            System.out.println(ex.getMessage());
        }
    
    }
    }
