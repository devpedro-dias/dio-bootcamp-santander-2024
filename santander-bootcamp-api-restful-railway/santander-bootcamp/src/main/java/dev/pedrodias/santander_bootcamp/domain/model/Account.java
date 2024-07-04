package dev.pedrodias.santander_bootcamp.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column(unique = true)
    @Getter @Setter private String number;

    @Getter @Setter private String agency;

    @Column(precision = 13, scale = 2)
    @Getter @Setter private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    @Getter @Setter private BigDecimal limit;

}
