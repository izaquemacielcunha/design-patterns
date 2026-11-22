package com.github.izaquemacielcunha.strategypattern.strategy.transacao;

import java.math.BigDecimal;

interface EstrategiaTransacao {

    void processarTransacao(BigDecimal valor);

    TipoTransacao getTipo();
}
