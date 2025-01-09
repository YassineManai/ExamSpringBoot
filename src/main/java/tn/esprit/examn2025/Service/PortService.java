package tn.esprit.examn2025.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examn2025.Entities.Action;
import tn.esprit.examn2025.Entities.Portefeuille;
import tn.esprit.examn2025.Repository.ActionRepo;
import tn.esprit.examn2025.Repository.PortRepo;


import java.util.List;
@Service
@AllArgsConstructor
public class PortService implements iPort{
    PortRepo portRepo;


    @Override
    public Portefeuille addPortefeuilleWithElements(Portefeuille portefeuille) {
        return portRepo.save(portefeuille);
    }
}
