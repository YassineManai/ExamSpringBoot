package tn.esprit.examn2025.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAction;
    private float prixAchatActuel;
    private float prixVenteActuel;
    private Long volume;
    private Date dateEmission;
    private String symbole;

    @OneToMany(mappedBy = "action", cascade = CascadeType.ALL)
    private Set<ordre> ordreList;
}
