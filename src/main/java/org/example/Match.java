package org.example;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import lombok.*;

@AllArgsConstructor
@Getter
public class Match {
   private String id;
   private LocalDate date;
   private String endroit;
   private Type type;
   private List<Combattant> combattants;


    public void finish () {

    }

}
