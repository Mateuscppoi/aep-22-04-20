package br.com.uniceumar.aula.calculadora;

import java.math.BigDecimal;

public interface Operacao {

    BigDecimal executar(BigDecimal n1, BigDecimal n2);
}
