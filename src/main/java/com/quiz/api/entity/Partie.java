package com.quiz.api.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity                    // Indique que cette classe est une table en BDD
@Table(name = "partie")    // Nom de la table
@Data                      // Lombok : génère getters, setters, toString, equals, hashCode
@NoArgsConstructor         // Lombok : génère le constructeur sans paramètres
@AllArgsConstructor        // Lombok : génère le constructeur avec tous les paramètres

public class Partie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private int score;

    @OneToMany(mappedBy = "partie")
    private List<Joueur> joueurs;

    @OneToMany(mappedBy = "partie")
    private List<Quiz> quizList;
    
}
