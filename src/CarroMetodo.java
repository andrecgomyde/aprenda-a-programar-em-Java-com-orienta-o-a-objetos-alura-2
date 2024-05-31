public class CarroMetodo {
    public static void main(String[] args) {
        Carro novoCarro = new Carro();
        novoCarro.modelo = "HB20";
        novoCarro.cor = "Preto";
        novoCarro.ano = 2021;

        novoCarro.fichaTecnica();
        System.out.println("Idade do veículo: " + novoCarro.idadeVeiculo() + " anos");
    }
}
