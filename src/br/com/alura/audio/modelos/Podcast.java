package br.com.alura.audio.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getDuracaoTotal() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2; // Exemplo de classificação baseado na média de avaliações
    }
}
