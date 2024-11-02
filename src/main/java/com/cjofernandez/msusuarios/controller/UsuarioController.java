package com.cjofernandez.msusuarios.controller;

import com.cjofernandez.msusuarios.controller.dto.UsuarioDTO;
import com.cjofernandez.msusuarios.model.Usuario;
import com.cjofernandez.msusuarios.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class UsuarioController {
    private final UsuarioService service;

    @PostMapping("/api/usuario")
    public ResponseEntity<Usuario> crearUsuario(@RequestBody UsuarioDTO request) {
        var response = this.service.crearUsuario(Usuario.builder()
                .cedula(request.getCedula()).correo(request.getCorreo()).nombre(request.getNombre())
                .telefono(request.getTelefono()).direccion(request.getDireccion()).build());
        return ResponseEntity.ok(response);
    }
}