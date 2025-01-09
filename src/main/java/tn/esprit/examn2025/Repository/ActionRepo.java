package tn.esprit.examn2025.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examn2025.Entities.Action;

public interface ActionRepo extends JpaRepository<Action,Long> {
}
