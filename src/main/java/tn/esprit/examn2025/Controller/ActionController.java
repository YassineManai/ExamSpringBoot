package tn.esprit.examn2025.Controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examn2025.Entities.Action;
import tn.esprit.examn2025.Service.ActionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/action")
@Tag(name = "Gestion action", description = "API for managing actions")

public class ActionController {



    ActionService actionService ;

    @PostMapping()
    @Operation(summary = "Add a new actions", description = "Creates a new action")
    public List<Action> addActions(@RequestBody List<Action> listeActions) {
        return actionService.addActions(listeActions)  ;  }
}
