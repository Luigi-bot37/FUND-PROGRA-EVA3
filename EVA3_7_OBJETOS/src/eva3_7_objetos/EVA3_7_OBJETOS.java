/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_objetos;

/**
 *
 * @author selva
 */
public class EVA3_7_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso1= new Persona();
        System.out.println(perso1);
        perso1.apellido="perez";
        perso1.nombre="pablo";
        perso1.edad=15;
        imprimirPersona(perso1);
        Persona perso2= new Persona();
        System.out.println(perso2);
        perso2.apellido="Escutia";
        perso2.nombre="Juan";
        perso2.edad=36;
        imprimirPersona(perso2);
    }
    //el argumento es tipo persona por que asi se llama la clase
    public static void imprimirPersona(Persona perso){
        System.out.println("Direccion: "+perso);
        System.out.println("Nombre completo: "+perso.nombre+ " "+perso.apellido);
        System.out.println("Edad: "+perso.edad);
    }
    
}
//definen un a plantilla para crear objetos
//crean un nuevo tipo de dato
class Persona{
    String nombre;
    String apellido;
    int edad;
}
