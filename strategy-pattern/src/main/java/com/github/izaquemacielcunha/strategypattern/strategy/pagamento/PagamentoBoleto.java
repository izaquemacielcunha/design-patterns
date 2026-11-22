package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class PagamentoBoleto implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        IO.println("Processando pagamento com boleto no valor de: " + valor);
    }

    @Override
    public TipoPagamento getTipo() {
        return TipoPagamento.BOLETO;
    }
}
