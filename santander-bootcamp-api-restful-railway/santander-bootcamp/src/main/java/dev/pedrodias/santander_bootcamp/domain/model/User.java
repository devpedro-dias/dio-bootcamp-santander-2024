package dev.pedrodias.santander_bootcamp.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Getter @Setter private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @Getter @Setter private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    @Getter @Setter private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter @Setter private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter @Setter private List<News> news;
}
