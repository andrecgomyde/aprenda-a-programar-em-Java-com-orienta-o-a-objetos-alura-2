package br.com.alura.audio.calculos;

import br.com.alura.audio.modelos.Musica;
import br.com.alura.audio.modelos.Podcast;
import br.com.alura.audio.modelos.Audio;
import br.com.alura.screenmatch.modelos.Titulo;


public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
