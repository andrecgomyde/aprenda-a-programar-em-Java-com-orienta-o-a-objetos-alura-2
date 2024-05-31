package carro;

public class PrincipalCarro {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro("Modelo A", 20000, 22000, 21000);
        ModeloCarro carro2 = new ModeloCarro("Modelo B", 25000, 24000, 26000);

        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();
    }
}

