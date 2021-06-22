package model;

import java.util.List;

public class Classificacao {
    private Times time;
    private List<Jogo> jogo;
    private int pontos;

    public Classificacao(){
    }

    public Classificacao(Times time, List<Jogo> jogo, int pontos) {
        this.time = time;
        this.jogo = jogo;
        this.pontos = pontos;
    }

    public Times getTimes() {
        return time;
    }

    public void setTimes(Times time) {
        this.time = time;
    }

    public List<Jogo> getJogo() {
        return jogo;
    }

    public void setJogo(List<Jogo> jogo) {
        this.jogo = jogo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
