package contaBancaria;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente(1000, 15);

        System.out.println("Saldo inicial: " + minhaConta.consultarSaldo());

        minhaConta.depositar(500);
        System.out.println("Saldo após depósito: " + minhaConta.consultarSaldo());

        minhaConta.sacar(200);
        System.out.println("Saldo após saque: " + minhaConta.consultarSaldo());

        minhaConta.cobrarTarifaMensal();
        System.out.println("Saldo após cobrança de tarifa: " + minhaConta.consultarSaldo());
    }
}
