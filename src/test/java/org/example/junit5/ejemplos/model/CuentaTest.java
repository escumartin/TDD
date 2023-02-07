package org.example.junit5.ejemplos.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
//        cuenta.setPersona("Andres");
        String esperado = "Andres";
        String real = cuenta.getPersona();

        assertEquals(esperado, real);
        assertTrue(real.equals("Andres"));
    }
}