package com.company.buisness.domain.implement;

import com.company.buisness.domain.entities.EspecialidadEntity;

public interface IEspecialidadIMPL {
    public Boolean guardarEspecialidad(EspecialidadEntity especialidad);
    public Boolean modificarEspecialidad(EspecialidadEntity especialidad);
    public Boolean eliminarEspecialidad(Long id);
}
