package com.company.buisness.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "pacientes")
public class PacienteEntity implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String telefono;
    private String direccion;


    @Column(unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    private PersonaEntity persona;


    @OneToMany (mappedBy = "pacientes")
    private List<CitaEntity> citas;

}
