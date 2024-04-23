package br.com.alura.mymusic.principal;

import br.com.alura.mymusic.modelos.MinhasPreferidas;
import br.com.alura.mymusic.modelos.Musica;
import br.com.alura.mymusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica bleedingMe = new Musica();
        bleedingMe.setTitulo("Bleeding Me");
        bleedingMe.setArtista("Metallica");

        for (int i = 0; i < 1500; i++) {
            bleedingMe.reproduz();
        }

        for (int i = 0; i < 900; i++) {
            bleedingMe.curte();
        }

        Podcast zueira = new Podcast();
        zueira.setTitulo("Vamos zuar!");
        zueira.setApresentador("Zuador");

        for (int i = 0; i < 500; i++) {
            zueira.reproduz();
        }

        for (int i = 0; i < 80; i++) {
            zueira.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(zueira);
        preferidas.inclui(bleedingMe);
    }
}
