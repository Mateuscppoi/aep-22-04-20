package br.com.uniceumar.aula.calculadora;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal n1 = BigDecimal.valueOf(100);
        BigDecimal n2 = BigDecimal.TEN;
        Calculadora somar = new Calculadora(new Adicao());
        Calculadora subtrair = new Calculadora(new Subtracao());
        Calculadora dividir = new Calculadora(new Divisao());
        Calculadora multiplicar = new Calculadora(new Multiplicacao());

        System.out.println(somar.executar(n1, n2));
        System.out.println(subtrair.executar(n1, n2));
        System.out.println(dividir.executar(n1, n2));
        System.out.println(multiplicar.executar(n1, n2));
    }
}
