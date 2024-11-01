public record Monedas (String monedaBase, String monedaObjetivo, double conversion_rate) {
    public double getTasaDeConversion() {
        return conversion_rate;
    }
}
