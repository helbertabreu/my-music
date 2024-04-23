package br.com.alura.mymusic.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um grande sucesso pelo público!");
        } else {
            System.out.println(audio.getTitulo() + " adicione a sua lista para ouvir mais tarde.");
        }
    }
}
