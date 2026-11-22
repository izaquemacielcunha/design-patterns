package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import java.util.Optional;

enum TipoTransacao {
    SAQUE,
    TRANSFERENCIA,
    DEPOSITO;

    public static Optional<TipoTransacao> getTipoTransacao(String tipo) {
        for (TipoTransacao tipoTransacao : TipoTransacao.values()) {
            if (tipoTransacao.name().equalsIgnoreCase(tipo)) {
                return Optional.of(tipoTransacao);
            }
        }
        return Optional.empty();
    }
}