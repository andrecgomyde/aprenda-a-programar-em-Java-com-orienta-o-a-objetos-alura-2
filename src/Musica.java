public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Número de avaliações: " + numAvaliacoes);
        System.out.println("Avaliação: " + avaliacao);
    }

    void avaliacaoMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMedia() {
        return avaliacao / numAvaliacoes;
    }
}
