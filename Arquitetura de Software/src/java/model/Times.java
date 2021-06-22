package model;

public class Times {
    private String nome;
    private int jogo;
    private int pontos;

    public Times() {
    }

    public Times(String nome, int jogo, int pontos) {
        this.nome = nome;
        this.jogo = jogo;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
