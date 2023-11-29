/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_tacos;

import java.util.Scanner;

/**
 *
 * @author selva
 */
public class EVA3_8_TACOS {
final static String USUARIO="Tacos";
final static String CLAVE="de pastor";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura= new Scanner(System.in);
        String usu;
        String pwd;
        do {            
           
             usu=ingresarUsuario("Usuario:");
             pwd=ingresarUsuario("Clave:");
          
        } while (!validarUsuario(usu, pwd));
    }
    public static String ingresarUsuario(String mensaje){
       Scanner captu=new Scanner(System.in);
        System.out.println(mensaje);
        return captu.nextLine();
    }
    public static boolean validarUsuario(String usuario, String clave){
        if(usuario.equals(USUARIO) && clave.equals(CLAVE))
            return true;
        else 
            return false;
    }
    
}
