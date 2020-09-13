package com.company.buisness.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "citas")

public class CitaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String motivoCita;
    private String estadoCita;
    private Integer horaInicio;
    private Integer horaFin;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id",nullable = false)
    private PacienteEntity pacientes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_consultorio", referencedColumnName = "id", nullable = false)
    private ConsultorioEntity consultorios;
}
