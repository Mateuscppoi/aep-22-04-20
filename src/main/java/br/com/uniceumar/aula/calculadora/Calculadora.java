package br.com.uniceumar.aula.calculadora;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Calculadora {

    private Operacao operacao;

    public BigDecimal executar(BigDecimal n1, BigDecimal n2) {
        return this.operacao.executar(n1, n2);
    }
}
