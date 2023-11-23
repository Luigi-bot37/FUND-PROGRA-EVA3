/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_funciones;

/**
 *
 * @author selva
 */
public class EVA3_1_FUNCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada a funcion o procedimiento
        imprimirMensaje("Hola mundo",5);
    }
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
              System.out.println(mensaje);
        }
      
    }
    
}
