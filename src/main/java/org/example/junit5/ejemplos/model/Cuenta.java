package org.example.junit5.ejemplos.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Cuenta {
    private String persona;
    private BigDecimal saldo;
}
