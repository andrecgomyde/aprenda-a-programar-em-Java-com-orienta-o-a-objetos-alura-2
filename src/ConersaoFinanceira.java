interface ConversaoFinanceira {
    double converterDolarParaReal(double valorEmDolar);
}

class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        // Considerando uma taxa de conversão fixa de 5.50
        return valorEmDolar * 5.50;
    }
}
