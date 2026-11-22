package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import java.util.Optional;

enum TipoPagamento {
    PIX,
    CARTAO_CREDITO,
    BOLETO;

    public static Optional<TipoPagamento> getTipoPagamento(String tipo) {
        for (TipoPagamento tipoPagamento : TipoPagamento.values()) {
            if (tipoPagamento.name().equalsIgnoreCase(tipo)) {
                return Optional.of(tipoPagamento);
            }
        }
        return Optional.empty();
    }
}