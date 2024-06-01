package br.com.alura.audio.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Musica extends Audio implements Classificavel {
    private String compositor;

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Compositor: " + compositor);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2; // Exemplo de classificação baseado na média de avaliações
    }
}
