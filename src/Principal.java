import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.audio.modelos.Musica;
import br.com.alura.audio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        // Testando a classe Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total para assistir tudo: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        // Testando a classe Musica
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Bohemian Rhapsody");
        minhaMusica.setAnoDeLancamento(1975);
        minhaMusica.setDuracaoEmMinutos(6);
        minhaMusica.setCompositor("Freddie Mercury");
        minhaMusica.avalia(10);
        minhaMusica.avalia(9);
        minhaMusica.avalia(10);
        System.out.println("Média de avaliações da música: " + minhaMusica.pegaMedia());
        System.out.println("Classificação da música: " + minhaMusica.getClassificacao());

        minhaMusica.exibeFichaTecnica();
        System.out.println("Compositor: " + minhaMusica.getCompositor());

        // Testando a classe Podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setNome("Podcast de Tecnologia");
        meuPodcast.setAnoDeLancamento(2022);
        meuPodcast.setTemporadas(2);
        meuPodcast.setEpisodiosPorTemporada(12);
        meuPodcast.setMinutosPorEpisodio(45);
        meuPodcast.avalia(9);
        meuPodcast.avalia(8);
        meuPodcast.avalia(7);
        System.out.println("Média de avaliações do podcast: " + meuPodcast.pegaMedia());
        System.out.println("Classificação do podcast: " + meuPodcast.getClassificacao());

        meuPodcast.exibeFichaTecnica();
        System.out.println("Duração total do podcast: " + meuPodcast.getDuracaoTotal() + " minutos");

        // Usando FiltroRecomendacao para Musica e Podcast
        filtro.filtra(minhaMusica);
        filtro.filtra(meuPodcast);
    }
}
