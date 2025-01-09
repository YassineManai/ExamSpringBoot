package tn.esprit.examn2025.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Portefeuille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPortefeuille;

    private Long reference;
    private float solde;

    @OneToMany(mappedBy = "portefeuille", cascade = CascadeType.ALL)
    private Set<elementPortefeuille> elementPortefeuillesList;


    @OneToMany(mappedBy = "portefeuille", cascade = CascadeType.ALL)
    private Set<ordre> ordresList;

}
