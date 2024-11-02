package com.cjofernandez.msusuarios.service;

import com.cjofernandez.msusuarios.model.Usuario;
import com.cjofernandez.msusuarios.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository repository;

    @Override
    public Usuario crearUsuario(Usuario request) {
        return this.repository.save(request);
    }
}
