package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class PagamentoPix implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        IO.println("Processando pagamento com pix no valor de: " + valor);
    }

    @Override
    public TipoPagamento getTipo() {
        return TipoPagamento.PIX;
    }
}
