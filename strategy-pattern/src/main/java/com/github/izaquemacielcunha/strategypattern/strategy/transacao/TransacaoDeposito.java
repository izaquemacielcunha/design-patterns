package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class TransacaoDeposito implements EstrategiaTransacao {

    @Override
    public void processarTransacao(BigDecimal valor) {
        IO.println("Executando transação de depósito no valor de " + valor);
    }

    @Override
    public TipoTransacao getTipo() {
        return TipoTransacao.DEPOSITO;
    }
}
