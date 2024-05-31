package carro;

public class ModeloCarro extends Carro {
    public ModeloCarro(String nomeModelo, double precoAno1, double precoAno2, double precoAno3) {
        setNomeModelo(nomeModelo);
        setPrecos(precoAno1, precoAno2, precoAno3);
    }
}
