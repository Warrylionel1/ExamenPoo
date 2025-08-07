package org.example;
import lombok.*;
import java.util.List;

@Getter
@AllArgsConstructor
@ToString

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private double poids ;
    private List<String> titres;

    Combattant(String id, String nom, String prenom, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poids = poids;
    }
}
