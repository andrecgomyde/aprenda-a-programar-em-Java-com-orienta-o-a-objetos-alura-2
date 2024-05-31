interface CalculoGeometrico {
    double calcularArea(double altura, double largura);
    double calcularPerimetro(double altura, double largura);
}

class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return 2 * (altura + largura);
    }
}
