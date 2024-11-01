import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Menu miMenu = new Menu();

        while(true){
            int opcion = miMenu.imprimirMenu();
            String[] monedas = miMenu.obtenerMonedas(opcion);

            if (monedas[0].isEmpty() || monedas[1].isEmpty()) {
                System.out.println("Intentalo de nuevo!");
                continue;
            }
            System.out.println("Ingrese el monto en " + monedas[0] + " a convertir:");
            double monto = teclado.nextDouble();

            ConsultaAPIConversor consulta = new ConsultaAPIConversor();
            Conversor miConversor = new Conversor();
            double montoConvertido = miConversor.convertir(monedas[0], monedas[1], consulta, monto);
            System.out.println("Monto equivalente: " + montoConvertido + " " + monedas[1]);
        }
    }
}
