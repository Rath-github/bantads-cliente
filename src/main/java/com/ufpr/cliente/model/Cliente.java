package com.ufpr.cliente.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Representa um cliente no sistema.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nome;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String email;

    @NotBlank
    @Column(nullable = false)
    private String telefone;

    @NotNull
    @PositiveOrZero
    @Column(nullable = false)
    private BigDecimal salario;

    @NotBlank
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

    @NotBlank
    @Column(length = 100, nullable = false)
    private String logradouro;

    @Column
    private String complemento;

    @NotBlank
    @Column(nullable = false)
    private String cidade;

    @NotBlank
    @Column(length = 2, nullable = false)
    private String estado;

    @NotBlank
    @Column(nullable = false)
    private String tipo;

    @NotBlank
    @Column(length = 8, nullable = false)
    private String cep;

    @NotNull
    @Column(nullable = false)
    private Integer numero;
}