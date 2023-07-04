package com.inexa.formation.infrastructure.mapper;

import com.inexa.formation.core.employe.domaine.entite.Employe;
import com.inexa.formation.infrastructure.entity.EmployeTable;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author N'LAGNI KWAMIVI MAWUSSI 2023-07-04
 */
@Mapper
public abstract class EmployeMapper {
    public static final  EmployeMapper INSTANCE= Mappers.getMapper(EmployeMapper.class);

    public abstract EmployeTable employeVersEmployeTable(Employe employe);
}
