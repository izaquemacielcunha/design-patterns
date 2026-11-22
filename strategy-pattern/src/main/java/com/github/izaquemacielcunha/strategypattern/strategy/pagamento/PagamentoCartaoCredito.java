package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class PagamentoCartaoCredito implements EstrategiaPagamento {

    @Override
    public void pagar(BigDecimal valor) {
        IO.println("Processando pagamento com cartão de crédito no valor de: " + valor);
    }

    @Override
    public TipoPagamento getTipo() {
        return TipoPagamento.CARTAO_CREDITO;
    }
}
