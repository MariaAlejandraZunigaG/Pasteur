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

public class AgendaCitaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;
    private String motivo_cita;
    private String estado_cita;
    private int Hora_inicio;
    private int Hora_fin;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private PacienteEntity paciente;

    @ManyToOne
    @JoinColumn(name = "id_consultorio")
    private ConsultorioEntity consultorio;
}
