package com.company.buisness.domain.implement;

import com.company.buisness.domain.entities.ConsultorioEntity;

import java.util.List;

public interface IConsultorioIMPL
{
    public List<ConsultorioEntity> findAll();
    public Boolean guardarConsultorio();


}
