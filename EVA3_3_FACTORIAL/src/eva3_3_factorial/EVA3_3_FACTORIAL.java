/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_factorial;

/**
 *
 * @author selva
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        System.out.println("Factorial de " + valor + " : " + calcularFactorial(valor));
        int numero1 = 4;
        int numero2=3;
        System.out.println("Potencia de " + numero1 + " : " + calcularPotencia(numero1, numero2));
    }

    public static int calcularFactorial(int num) {

        int guardar = 1;
        for (int i = 1; i <= num; i++) {
            guardar *= i; //guardar=guardar*i;

        }
        return guardar;
    }

    //metodo para potencia
    public static int calcularPotencia(int base, int exponente) {
        int potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }
        return potencia;
    }
}
