package com.quiz.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity                    // Indique que cette classe est une table en BDD
@Table(name = "reponses")    // Nom de la table
@Data                      // Lombok : génère getters, setters, toString, equals, hashCode
@NoArgsConstructor         // Lombok : génère le constructeur sans paramètres
@AllArgsConstructor        // Lombok : génère le constructeur avec tous les paramètres

public class Reponse {

    @Id                                                    // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // Auto-incrément
    private Long id;

    @Column(nullable = false)
    private String texte;

    @Column(nullable = false)
    private boolean bonneReponse = false;

    @Column(nullable = false)
    private Position position = Position.A;

    public enum Position{
        A,
        B,
        C,
        D
    }
    
}
