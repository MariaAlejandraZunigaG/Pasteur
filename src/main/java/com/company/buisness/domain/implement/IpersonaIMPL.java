package com.company.buisness.domain.implement;

import com.company.buisness.domain.entities.PersonaEntity;

public interface IpersonaIMPL {
    public Boolean guardarPersona(PersonaEntity persona);
    public Boolean modificarPersona(PersonaEntity persona);
    public Boolean eliminarPersona(Long id);


}
