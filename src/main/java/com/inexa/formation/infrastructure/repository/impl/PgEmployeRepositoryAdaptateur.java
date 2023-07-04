package com.inexa.formation.infrastructure.repository.impl;

import com.inexa.formation.core.employe.application.port.EmployeRepositoryPort;
import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.infrastructure.entity.EmployeTable;
import com.inexa.formation.infrastructure.mapper.EmployeMapper;
import com.inexa.formation.infrastructure.repository.EmployeRepositoryJpa;
import org.springframework.stereotype.Repository;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */
@Repository
public class PgEmployeRepositoryAdaptateur implements EmployeRepositoryPort {
    private final EmployeRepositoryJpa employeRepositoryJpa;
    private final EmployeMapper employeMapper;

    public PgEmployeRepositoryAdaptateur(EmployeRepositoryJpa employeRepositoryJpa) {
        this.employeRepositoryJpa = employeRepositoryJpa;
        this.employeMapper = EmployeMapper.INSTANCE;
    }

    @Override
    public void enregistrer(Employe employe) {
        EmployeTable employeTable = employeMapper.employeVersEmployeTable(employe);
        this.employeRepositoryJpa.save(employeTable);
    }
}
