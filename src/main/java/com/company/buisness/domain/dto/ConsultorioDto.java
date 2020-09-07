package com.company.buisness.domain.dto;


import com.company.buisness.domain.entities.EspecialidadEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ConsultorioDto {
    private Long id;
    private String name;
    private EspecialidadEntity especialidad;
}
