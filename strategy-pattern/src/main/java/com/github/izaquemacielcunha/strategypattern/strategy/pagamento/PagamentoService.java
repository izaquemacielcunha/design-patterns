package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Service
class PagamentoService {

    private final Map<TipoPagamento, EstrategiaPagamento> estrategias = new EnumMap<>(TipoPagamento.class);

    public PagamentoService(List<EstrategiaPagamento> listaEstrategias) {
        listaEstrategias.forEach(estrategia -> estrategias.put(estrategia.getTipo(), estrategia));
    }

    public void processarPagamento(String tipo, BigDecimal valor) {
        TipoPagamento tipoPagamento = TipoPagamento.getTipoPagamento(tipo).orElseThrow(() -> new IllegalArgumentException("Método de pagamento não suportado: " + tipo));
        EstrategiaPagamento estrategia = estrategias.get(tipoPagamento);
        estrategia.pagar(valor);
    }
}
