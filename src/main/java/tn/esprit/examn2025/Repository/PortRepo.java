package tn.esprit.examn2025.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examn2025.Entities.Action;
import tn.esprit.examn2025.Entities.Portefeuille;

public interface PortRepo extends JpaRepository<Portefeuille,Long> {
}
