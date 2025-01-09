package tn.esprit.examn2025.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examn2025.Entities.Action;
import tn.esprit.examn2025.Repository.ActionRepo;


import java.util.List;
@Service
@AllArgsConstructor
public class ActionService implements iAction {

    ActionRepo actionRepo;
    @Override
    public List<Action> addActions(List<Action> listeActions) {
        return actionRepo.saveAll(listeActions);
    }
}
