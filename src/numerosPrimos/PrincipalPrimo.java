package numerosPrimos;

public class PrincipalPrimo {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        // Testando VerificadorPrimo
        System.out.println("Verificando se números são primos:");
        verificador.verificarSeEhPrimo(17);
        verificador.verificarSeEhPrimo(18);

        // Testando GeradorPrimo
        System.out.println("Gerando próximos números primos:");
        System.out.println("Próximo primo após 17: " + gerador.gerarProximoPrimo(17));
        System.out.println("Próximo primo após 18: " + gerador.gerarProximoPrimo(18));

        // Listando primos até um limite
        System.out.println("Listando primos até 30:");
        gerador.listarPrimos(30);
    }
}
