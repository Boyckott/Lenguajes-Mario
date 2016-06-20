/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author T-107
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
        
        //Paso 1 Crear usuario
        Usuario u=new Usuario("Juan",20,"juan@gmail.com");
        
        //Paso 2 Guardar este usuario 
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            p.guardar(u);
            System.out.println("Usuario Guardado");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
