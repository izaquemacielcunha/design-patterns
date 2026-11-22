package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/transacao")
class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @PostMapping("/processar")
    public ResponseEntity<String> processarTransacao(@RequestParam String tipo, @RequestParam BigDecimal valor) {
        transacaoService.processarTransacao(tipo, valor);
        return ResponseEntity.ok("Transação processada com sucesso.");
    }
}