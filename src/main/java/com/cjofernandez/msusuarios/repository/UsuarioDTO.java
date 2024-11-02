package com.cjofernandez.msusuarios.repository;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class UsuarioDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nombre;
    @Column
    private Integer cedula;
    @Column
    private String correo;
    @Column
    private String telefono;
    @Column
    private String direccion;
}