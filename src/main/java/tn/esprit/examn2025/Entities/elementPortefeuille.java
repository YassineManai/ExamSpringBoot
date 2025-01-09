package tn.esprit.examn2025.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class elementPortefeuille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idElement;
    private String symbole;
    private Long nombreActoins ;
    private float prixAchat;

    @ManyToOne
    Portefeuille portefeuille;
}
