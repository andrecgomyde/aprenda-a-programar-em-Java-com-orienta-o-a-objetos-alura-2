public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int idadeVeiculo() {
        int anoAtual = 2024;
        return anoAtual - ano;
    }
}
