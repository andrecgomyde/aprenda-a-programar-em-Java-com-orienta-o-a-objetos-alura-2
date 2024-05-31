interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}

class Produto implements Vendavel {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        preco -= preco * percentualDesconto / 100;
    }
}

class Servico implements Vendavel {
    private double precoPorHora;

    public Servico(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    @Override
    public double calcularPrecoTotal(int horas) {
        return precoPorHora * horas;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        // Não aplicável para serviços
    }
}
