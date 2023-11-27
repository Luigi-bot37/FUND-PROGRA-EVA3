/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_paso_parametros_referencia;

/**
 *
 * @author selva
 */
public class EVA3_6_PASO_PARAMETROS_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []arreglo= new int[5];
        System.out.println("La direccion del arreglo es: "+arreglo);
        llenarArreglo(arreglo);
        for (int i : arreglo) {
            System.out.print("["+i+"]");
        }
    }
    /*la direccion de arreglo abora se la esta dadno a valores
    
    */
   
    public static void llenarArreglo(int []valores){
        System.out.println("La direccion de valores es: "+valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i]=(int)(Math.random()*100);
        }
    }
}
