package org.example;
import lombok.*;
import java.util.List;


@AllArgsConstructor
@ToString
public class Ligue {
   private String nom;
   private Combattant combattant;
   private Match match;

}