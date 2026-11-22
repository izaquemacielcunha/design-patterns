package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
class TransacaoService {
    private final TransacaoFactory transacaoFactory;

    public TransacaoService(TransacaoFactory transacaoFactory) {
        this.transacaoFactory = transacaoFactory;
    }

    public void processarTransacao(String tipoTransacao, BigDecimal valor) {
        EstrategiaTransacao estrategiaTransacao = transacaoFactory.getTransacao(tipoTransacao);
        estrategiaTransacao.processarTransacao(valor);
    }
}
