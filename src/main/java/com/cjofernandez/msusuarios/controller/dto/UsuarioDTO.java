package com.cjofernandez.msusuarios.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuarioDTO {
    @Size(max = 10, message = "El nombre es demasiado largo")
    private String nombre;
    private Integer cedula;
    @Email(message = "El campo no tiene formato de correo")
    private String correo;
    private String telefono;
    private String direccion;
}