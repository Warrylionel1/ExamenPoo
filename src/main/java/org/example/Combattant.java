package org.example;
import lombok.*;
import java.util.List;
import java.util.Optional;

@Getter
@AllArgsConstructor
@ToString

public class Combattant {
    private final String id;
    private final String nom;
    private final String prenom;
    private double poids ;
    private List<String> titres;
    private Match matches;

    Combattant(String id, String nom, String prenom, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poids = poids;
    }


}
