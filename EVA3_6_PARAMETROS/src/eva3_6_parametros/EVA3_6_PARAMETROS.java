/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_parametros;

/**
 *
 * @author selva
 */
public class EVA3_6_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        System.out.println("Valor de x en main() es: "+x);
        pasoporValor(5);
        System.out.println("Valor de x en el main() tras hacer el metodo es: "+x);
    }
    //EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVIA UNA COPIA AL METODO
    public static void pasoporValor(int valor){
        
        System.out.println("El valor del metodod es: "+valor);
        valor++;
        System.out.println("El valor modificado del metodo es: "+valor);
    }
    
}
