package com.inexa.formation.infrastructure.interfaces.rest;

import com.inexa.formation.GestionnaireCommande;
import com.inexa.formation.core.employe.application.commande.CreerEmployeCommande;
import com.inexa.formation.core.employe.application.gestionnairecommande.GestionnaireCreerEmployeCommande;
import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-07-04
 */
@RestController
@RequestMapping("/employe")
public class EmployeResource {

    private final GestionnaireCommande<CreerEmployeCommande> gestionnaireCreerEmployeCommande;

    public EmployeResource(EmployeRepositoryPort employeRepositoryPort) {
        this.gestionnaireCreerEmployeCommande = new GestionnaireCreerEmployeCommande(employeRepositoryPort);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void creerEmploye(@Valid @RequestBody CreerEmployeCommande commande) {
        this.gestionnaireCreerEmployeCommande.execute(commande);
    }
}
