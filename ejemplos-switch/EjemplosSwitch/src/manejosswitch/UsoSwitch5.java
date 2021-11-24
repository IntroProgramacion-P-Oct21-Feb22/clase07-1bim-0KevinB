/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package manejosswitch;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese su ciudad de residencia");
        String cadena = entrada.nextLine();
        
        switch(cadena){
            case "Quito":
            case "quito":
            case "QUITO":
                System.out.printf("Bienvenido a las artes vivas de: %s\n", 
                        cadena);
                break;    
            
            default:
                System.out.println("Acceso denegado");
                break;
        }
        
    }
}
