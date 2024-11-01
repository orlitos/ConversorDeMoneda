import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner teclado = new Scanner(System.in);

    public int imprimirMenu() {
        int opcion = -1;
        while(true) {
            System.out.println("""
                    *** Monedas a convertir ***
                    1. Pesos Colombianos a Euros
                    2. Euros a Pesos Colombianos
                    3. Pesos Colombianos a Reales Brazileros
                    4. Reales Brazileros a Pesos Colombianos
                    5. Pesos Colombianos a Moneda Chilena
                    6. Moneda Chilena a Pesos Colombianos
                    7. Salir
                    
                    Opción:""");

            try{
                opcion = teclado.nextInt();
                if (opcion >= 1 && opcion <= 7){
                    break;
                }else {
                    System.out.println("Solo elige opciones entre 1 y 7 inclusive.");
                }
        } catch(InputMismatchException e) {
                System.out.println("Entrada inavalida. Solo se aceptan valores numericos entre 1 y 7.");
                teclado.next(); //Limpia la entrada incorrecta
            }
        }
        return opcion;
    }

    public String[] obtenerMonedas(int opcion){
         String monedaBase = "";
         String monedaObjetivo = "";

         switch(opcion){
             case 1: monedaBase = "COP"; monedaObjetivo = "EUR"; break;
             case 2: monedaBase = "EUR"; monedaObjetivo = "COP"; break;
             case 3: monedaBase = "COP"; monedaObjetivo = "BRL"; break;
             case 4: monedaBase = "BRL"; monedaObjetivo = "COP"; break;
             case 5: monedaBase = "COP"; monedaObjetivo = "CLP"; break;
             case 6: monedaBase = "CLP"; monedaObjetivo = "COP"; break;
             case 7: System.out.println("Salgo ya del programa!"); System.exit(0); break;
             default: System.out.println("Opción no permitida.");
         }
         return new String[]{monedaBase, monedaObjetivo};
    }
}