public class MusicaMetodo {
    public static void main(String[] args) {
        Musica novaMusica = new Musica();
        novaMusica.titulo = "Sexta-feira";
        novaMusica.artista = "André";
        novaMusica.anoLancamento = 2024;

        novaMusica.fichaTecnica();

        novaMusica.avaliacaoMusica(8);
        novaMusica.avaliacaoMusica(6);
        novaMusica.avaliacaoMusica(2);

        System.out.println("Avaliação musical: " + novaMusica.numAvaliacoes);
        System.out.println("Média das avaliações: " + novaMusica.calculaMedia());
    }
}
