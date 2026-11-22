package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class TransacaoSaque implements EstrategiaTransacao {

    @Override
    public void processarTransacao(BigDecimal valor) {
        IO.println("Executando transação de saque no valor de " + valor);
    }

    @Override
    public TipoTransacao getTipo() {
        return TipoTransacao.SAQUE;
    }
}
