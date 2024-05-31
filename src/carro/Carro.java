package carro;

public class Carro {
    private String nomeModelo;
    private double[] precos = new double[3];

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precos[0] = precoAno1;
        this.precos[1] = precoAno2;
        this.precos[2] = precoAno3;
    }

    public double getMenorPreco() {
        double menor = precos[0];
        for (double preco : precos) {
            if (preco < menor) {
                menor = preco;
            }
        }
        return menor;
    }

    public double getMaiorPreco() {
        double maior = precos[0];
        for (double preco : precos) {
            if (preco > maior) {
                maior = preco;
            }
        }
        return maior;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preços: ");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Ano " + (i + 1) + ": " + precos[i]);
        }
        System.out.println("Menor preço: " + getMenorPreco());
        System.out.println("Maior preço: " + getMaiorPreco());
    }
}
