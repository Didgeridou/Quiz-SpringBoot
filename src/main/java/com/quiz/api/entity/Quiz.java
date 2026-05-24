package com.quiz.api.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity                    // Indique que cette classe est une table en BDD
@Table(name = "quiz")    // Nom de la table
@Data                      // Lombok : génère getters, setters, toString, equals, hashCode
@NoArgsConstructor         // Lombok : génère le constructeur sans paramètres
@AllArgsConstructor        // Lombok : génère le constructeur avec tous les paramètres

public class Quiz {

    @Id                                                    // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // Auto-incrément
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Categorie categorie = Categorie.GEOGRAPHIE;

    @ManyToOne
    @JoinColumn(name="redacteur_id")
    private Redacteur redacteur;

    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;

    @ManyToOne
    @JoinColumn(name="partie_id")
    private Partie partie;

    public enum Categorie{
        CULTURE_GENERALE,
        CINEMA,
        JEUX_VIDEO,
        HISTOIRE,
        GEOGRAPHIE
    }
    
}
