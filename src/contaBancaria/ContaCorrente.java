package contaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(double saldoInicial, double tarifaMensal) {
        super(saldoInicial);
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        sacar(tarifaMensal);
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada.");
    }
}
