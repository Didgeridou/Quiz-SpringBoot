package com.quiz.api.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity                    // Indique que cette classe est une table en BDD
@Table(name = "redacteurs")    // Nom de la table
@Data                      // Lombok : génère getters, setters, toString, equals, hashCode
@NoArgsConstructor         // Lombok : génère le constructeur sans paramètres
@AllArgsConstructor        // Lombok : génère le constructeur avec tous les paramètres

public class Redacteur {

    @Id                                                    // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // Auto-incrément
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @OneToMany(mappedBy = "redacteur", cascade = CascadeType.ALL)
    private List<Quiz> quizList;
    
}
