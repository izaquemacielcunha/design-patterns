package com.github.izaquemacielcunha.strategypattern.strategy.pagamento;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/pagamento")
class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/pagar")
    public ResponseEntity<String> realizarPagamento(@RequestParam String tipo, @RequestParam BigDecimal valor) {
        pagamentoService.processarPagamento(tipo, valor);
        return ResponseEntity.ok("Pagamento processado via " + tipo);
    }
}
