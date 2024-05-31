package br.com.alura.audio.modelos;

import br.com.alura.audio.calculos.Classificavel;

public class Musica extends Audio {
    private String compositor;

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
