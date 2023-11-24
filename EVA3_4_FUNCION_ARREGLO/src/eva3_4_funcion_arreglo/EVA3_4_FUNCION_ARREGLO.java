/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_funcion_arreglo;

/**
 *
 * @author selva
 */
public class EVA3_4_FUNCION_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[]=crearArreglo(5);
        for (int i : arreglo) {
            System.out.println("["+i+"]");
        }
    }

    public static int[] crearArreglo(int tama) {
        int arreglo[] = new int[tama];
        for (int i = 0; i < tama; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        return arreglo;
    }
}
