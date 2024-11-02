package com.cjofernandez.msusuarios.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private final Long id;
    private final String nombre;
    private final Integer cedula;
    private final String correo;
    private final String telefono;
    private final String direccion;
}