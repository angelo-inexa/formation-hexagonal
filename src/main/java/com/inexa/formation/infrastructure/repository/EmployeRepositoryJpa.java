package com.inexa.formation.infrastructure.repository;

import com.inexa.formation.infrastructure.entity.EmployeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-06-30
 */

public interface EmployeRepositoryJpa extends JpaRepository<EmployeTable, UUID> {

}
