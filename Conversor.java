import java.util.Scanner;

public class Conversor {
    public double convertir(String monedaBase, String monedaObjetivo, ConsultaAPIConversor consulta, double montoBase) {
        Monedas resultado = consulta.buscaTipoMoneda(monedaBase, monedaObjetivo);
        double tasaDeConversion = resultado.getTasaDeConversion();
        double montoEquivalente = montoBase * tasaDeConversion;
        return montoEquivalente;
    }
}
