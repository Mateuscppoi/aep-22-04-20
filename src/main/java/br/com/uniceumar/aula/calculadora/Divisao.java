package br.com.uniceumar.aula.calculadora;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divisao implements Operacao {

    @Override
    public BigDecimal executar(BigDecimal n1, BigDecimal n2) {
        return n1.divide(n2, RoundingMode.HALF_UP);
    }
}
