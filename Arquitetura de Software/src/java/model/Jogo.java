package model;

public class Jogo {

    private Times timeA;
    private Times timeB;
    private int pontosTimeA;
    private int pontosTimeB;

    public Jogo(){
    }

    public Jogo(Times timeA, Times timeB, int pontosTimeA, int pontosTimeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.pontosTimeA = pontosTimeA;
        this.pontosTimeB = pontosTimeB;
    }

    public Times getTimeA() {
        return timeA;
    }

    public void setTimeA(Times timeA) {
        this.timeA = timeA;
    }

    public Times getTimeB() {
        return timeB;
    }

    public void setTimeB(Times timeB) {
        this.timeB = timeB;
    }

    public int getPontosTimeA() {
        return pontosTimeA;
    }

    public void setPontosTimeA(int pontosTimeA) {
        this.pontosTimeA = pontosTimeA;
    }

    public int getPontosTimeB() {
        return pontosTimeB;
    }

    public void setPontosTimeB(int pontosTimeB) {
        this.pontosTimeB = pontosTimeB;
    }

}
