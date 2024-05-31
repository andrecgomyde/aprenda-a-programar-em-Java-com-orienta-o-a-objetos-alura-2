package numerosPrimos;

public class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int numero) {
        int proximo = numero + 1;
        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        return proximo;
    }
}
