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
import tn.esprit.examn2025.Entities.Portefeuille;
import tn.esprit.examn2025.Service.ActionService;
import tn.esprit.examn2025.Service.PortService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/port")
@Tag(name = "Gestion Port", description = "API for managing Port")
public class PortController {

    PortService portService;

    @PostMapping()
    @Operation(summary = "Add a new ports", description = "Creates a new ports")
    public Portefeuille addPortfeuille(@RequestBody Portefeuille portefeuille) {
        return portService.addPortefeuilleWithElements(portefeuille)  ;  }
}
