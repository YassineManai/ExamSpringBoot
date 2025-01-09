package tn.esprit.examn2025.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ordre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrdre;
    private Long volume;
    private Date DateCreation;
    private Date dateExecution;
    private Float montant;

    @Enumerated(EnumType.STRING)
    private statut Statut;

    @Enumerated(EnumType.STRING)
    private typeOrdre typeOrdre;

    @ManyToOne
    @JsonIgnore
    Portefeuille portefeuille;

    @ManyToOne
    @JsonIgnore
    Action action;




}
