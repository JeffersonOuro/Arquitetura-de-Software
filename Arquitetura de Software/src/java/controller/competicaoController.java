package controller;

import model.Classificacao;
import model.Times;
import model.Jogo;
import service.CompeticaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class competicaoController {
    @Autowired
    CompeticaoService competicaoService;

    @GetMapping("/classificacao")
    public ResponseEntity<List<Classificacao>> listarClassificacao(){
        return ResponseEntity.ok(competicaoService.buscarClassificacao());
    }

    @PostMapping("/jogo")
    public ResponseEntity<Jogo> criarPartida(Jogo jogo){
        return ResponseEntity.ok(competicaoService.criarJogo(jogo));
    }

    @PostMapping("/time")
    public ResponseEntity<Times> criarTimes(Times times){
        return ResponseEntity.ok(competicaoService.criarTimes(times));
    }
}
