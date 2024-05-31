interface Calculavel {
    double calcularPrecoFinal();
}

class Livro implements Calculavel {
    private double preco;

    public Livro(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        // Lógica de cálculo do preço final do livro com desconto, por exemplo
        return preco * 0.9; // Desconto de 10%
    }
}

class ProdutoFisico implements Calculavel {
    private double preco;

    public ProdutoFisico(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        // Lógica de cálculo do preço final do produto físico com taxas adicionais, por exemplo
        return preco * 1.05; // Taxa adicional de 5%
    }
}
