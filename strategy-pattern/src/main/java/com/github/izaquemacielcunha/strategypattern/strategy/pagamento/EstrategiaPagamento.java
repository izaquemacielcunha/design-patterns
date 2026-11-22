package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import java.math.BigDecimal;

interface EstrategiaPagamento {

    void pagar(BigDecimal valor);

    TipoPagamento getTipo();
}