/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author mario
 */
public class PersistenciaUsuario {
    
    //Esta es una clase model de tiopo LOgico, solamente contiene 
    //metodos que representan acciones concfretas, la sintaxis 
    //y estructura de dicho metodo depende de la ccion. 
    
    ArrayList<Usuario>usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    
    //Primero generamos el metodo que nos guarda un usuario 
    
    public void guardar(Usuario u)throws  Exception{
        //Paso 1 generar el archivo a guardarse
        
       File f=new File("archivaldo.raton");
       if(f.exists()) usuarios=buscarTodos();
       //Indicar que se va a guardar 
       FileOutputStream fos=new FileOutputStream(f);
       
       //Generar el objetoto que nos va a ayudar a guardar el ArrayList de USuarios 
       
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       
        //Ahora si a guardar el objeto 
        usuarios.add(u);
            oos.writeObject(usuarios);
            }
    
    //Empieza el metodo de leer los usuarios guardados 
    
    public ArrayList<Usuario> buscarTodos()throws Exception{
        File f=new File("archivaldo.raton");
        
            //Indicar que se va a guardar
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        usuarios=(ArrayList<Usuario>) ois.readObject();
        return usuarios;
    }
}
