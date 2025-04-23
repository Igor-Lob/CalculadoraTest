package com.exemplo;  // Deve ser o mesmo pacote da Calculadora

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void testSomarDoisNumerosPositivos() {  // Corrigido "Positives" para "Positivos"
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 3);  // Removida a sintaxe "a: 2, b: 3"
        assertEquals(5, resultado, "A soma de 2 + 3 deve ser 5");  // Removido "expected:" e "message:"
    }
}