package service;

import model.Classificacao;
import model.Times;
import model.Jogo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompeticaoService {

    public List<Classificacao> buscarClassificacao() {
        return gerarTabela();
    }

    public Jogo criarJogo(Jogo jogo) {
        return computarJogo(jogo);
    }

    public Times criarTimes(Times time) {
        return new Times(time.getNome(), time.getJogo(), time.getPontos());
    }

    private List<Classificacao> gerarTabela() {
        List<Times> time = new ArrayList<Times>();
        List<Jogo> jogo = new ArrayList<Jogo>();
        List<Classificacao> classificacoes = new ArrayList<Classificacao>();

        
        Times time1 = new Times("Brasil", 0, 0);
        Times time2 = new Times("Alemanha", 0, 0);
        Times time3 = new Times("Argentina", 0, 0);
        Times time4 = new Times("Inglaterra", 0, 0);
        Times time5 = new Times("França", 0, 0);
        Times time6 = new Times("Espanha", 0, 0);


        Jogo jogo1 = new Jogo(time1, time2, 1, 0);
        jogo1 = computarJogo(jogo1);
        time1 = jogo1.getTimeA();
        time2 = jogo1.getTimeB();

        Jogo jogo2 = new Jogo(time3, time4, 1, 3);
        jogo2 = computarJogo(jogo2);
        time3 = jogo2.getTimeA();
        time4 = jogo2.getTimeB();

        Jogo jogo3 = new Jogo(time5, time6, 3, 0);
        jogo3 = computarJogo(jogo3);
        time5 = jogo3.getTimeA();
        time6 = jogo3.getTimeB();

        Jogo jogo4 = new Jogo(time1, time3, 2, 1);
        jogo4 = computarJogo(jogo4);
        time1 = jogo4.getTimeA();
        time3 = jogo4.getTimeB();

        Jogo jogo5 = new Jogo(time2, time4, 1, 2);
        jogo5 = computarJogo(jogo5);
        time2 = jogo5.getTimeA();
        time4 = jogo5.getTimeB();

        Jogo jogo6 = new Jogo(time3, time5, 3, 0);
        jogo6 = computarJogo(jogo6);
        time3 = jogo6.getTimeA();
        time5 = jogo6.getTimeB();

        Jogo jogo7 = new Jogo(time1, time4, 3, 1);
        jogo7 = computarJogo(jogo7);
        time1 = jogo7.getTimeA();
        time4 = jogo7.getTimeB();

        Jogo jogo8 = new Jogo(time2, time5, 2, 3);
        jogo8 = computarJogo(jogo8);
        time2 = jogo8.getTimeA();
        time5 = jogo8.getTimeB();

        Jogo jogo9 = new Jogo(time3, time6, 1, 4);
        jogo9 = computarJogo(jogo9);
        time3 = jogo9.getTimeA();
        time6 = jogo9.getTimeB();

        Jogo jogo10 = new Jogo(time1, time5, 2, 1);
        jogo10 = computarJogo(jogo10);
        time1 = jogo10.getTimeA();
        time5 = jogo10.getTimeB();

        Jogo jogo11 = new Jogo(time2, time6, 1, 0);
        jogo11 = computarJogo(jogo11);
        time2 = jogo11.getTimeA();
        time6 = jogo11.getTimeB();

        Jogo jogo12 = new Jogo(time3, time1, 0, 1);
        jogo12 = computarJogo(jogo12);
        time3 = jogo12.getTimeA();
        time1 = jogo12.getTimeB();

        Jogo jogo13 = new Jogo(time1, time2, 1, 0);
        jogo13 = computarJogo(jogo13);
        time1 = jogo13.getTimeA();
        time2 = jogo13.getTimeB();

        Jogo jogo14 = new Jogo(time4, time3, 2, 0);
        jogo14 = computarJogo(jogo14);
        time4 = jogo14.getTimeA();
        time3 = jogo14.getTimeB();

        Jogo jogo15 = new Jogo(time3, time5, 1, 3);
        jogo15 = computarJogo(jogo15);
        time3 = jogo15.getTimeA();
        time5 = jogo15.getTimeB();

        Jogo jogo16 = new Jogo(time1, time6, 2, 1);
        jogo16 = computarJogo(jogo16);
        time3 = jogo16.getTimeA();
        time6 = jogo16.getTimeB();


        Classificacao classificacaoTime1 = new Classificacao(time1,
                Arrays.asList(jogo1, jogo4, jogo7, jogo10, jogo12, jogo13, jogo16),
                time1.getPontos());

        Classificacao classificacaoTime2 = new Classificacao(time2,
                Arrays.asList(jogo1, jogo5, jogo8, jogo11, jogo13),
                time2.getPontos());

        Classificacao classificacaoTime3 = new Classificacao(time3,
                Arrays.asList(jogo2, jogo4, jogo6, jogo9, jogo12, jogo14, jogo15),
                time3.getPontos());

        Classificacao classificacaoTime4 = new Classificacao(time4,
                Arrays.asList(jogo2, jogo5, jogo7, jogo14),
                time4.getPontos());

        Classificacao classificacaoTime5 = new Classificacao(time5,
                Arrays.asList(jogo3, jogo6, jogo8, jogo10, jogo15),
                time5.getPontos());

        Classificacao classificacaoTime6 = new Classificacao(time6,
                Arrays.asList(jogo3, jogo9, jogo11, jogo16),
                time6.getPontos());

        time.add(time1);
        time.add(time2);
        time.add(time3);
        time.add(time4);
        time.add(time5);
        time.add(time6);

        time.addAll(Arrays.asList(time1, time2, time3, time4, time5, time6));

        jogo.addAll(Arrays.asList(
                jogo1,
                jogo2,
                jogo3,
                jogo4,
                jogo5,
                jogo6,
                jogo7,
                jogo8,
                jogo9,
                jogo10,
                jogo11,
                jogo12,
                jogo13,
                jogo14,
                jogo15,
                jogo16
        ));
        classificacoes.addAll(Arrays.asList(
                classificacaoTime1,
                classificacaoTime2,
                classificacaoTime3,
                classificacaoTime4,
                classificacaoTime5,
                classificacaoTime6
        ));
        return classificacoes;
    }

    private Jogo computarJogo(Jogo jogo) {
        Times timeA = jogo.getTimeA();
        Times timeB = jogo.getTimeB();

        if (jogo.getPontosTimeA() > jogo.getPontosTimeB()) {
            timeA.setJogo(timeA.getJogo() + 1);
            timeA.setPontos(timeA.getPontos() + 1);

            timeB.setJogo(timeB.getJogo() + 1);
        } else if (jogo.getPontosTimeB() > jogo.getPontosTimeA()) {
            timeB.setJogo(timeB.getJogo() + 1);
            timeB.setPontos(timeB.getPontos() + 1);

            timeA.setJogo(timeA.getJogo() + 1);
        }
        jogo.setTimeA(timeA);
        jogo.setTimeB(timeB);

        return jogo;
    }

   
}
