package com.inexa.formation.infrastructure.entity;

import com.inexa.formation.core.employe.domaine.objetvaleur.Civilite;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
@Getter
@Setter
@Entity
@Table(name = "employes")
@Data
public class EmployeTable {

    @Id
    private UUID id;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Civilite civilite;


}
