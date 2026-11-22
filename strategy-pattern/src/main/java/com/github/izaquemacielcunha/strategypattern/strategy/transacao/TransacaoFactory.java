package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
class TransacaoFactory {
    private final Map<TipoTransacao, EstrategiaTransacao> estrategiasTransacao = new EnumMap<>(TipoTransacao.class);

    public TransacaoFactory(List<EstrategiaTransacao> estrategiasTransacao) {
        for (EstrategiaTransacao estrategia : estrategiasTransacao) {
            this.estrategiasTransacao.put(estrategia.getTipo(), estrategia);
        }
    }

    public EstrategiaTransacao getTransacao(String transacao) {
        TipoTransacao tipoTransacao = TipoTransacao.getTipoTransacao(transacao).orElseThrow(() -> new IllegalArgumentException("Tipo de transação inválido: " + transacao));
        return estrategiasTransacao.get(tipoTransacao);
    }
}

