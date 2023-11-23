/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_valor_maximo;

/**
 *
 * @author selva
 */
public class EVA3_2_VALOR_MAXIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada a funcion(invocarlo)
        //utilizar el valor directamente de la funcion
        System.out.println(buscarMaximo(100, 200));
        //guardar el valor y usarlo despues
        int resu=buscarMaximo(100, 200);
        System.out.println(resu);
        //llamar la funcion e ignorar el resultado
        buscarMaximo(100, 200);
    }

    //el metodo simplemetne busca y devuelve 
    public static int buscarMaximo(int val1, int val2) {
        /*  if(val1>val2)
         return val1;   
        else
            return val2;*/
        int result;
        if (val1 > val2) 
            result = val1;
         else 
            result = val2;
        
        return result;
        //se recomiendo solo usar un return
    }

}
