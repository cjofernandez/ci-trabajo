package com.cjofernandez.msusuarios.repository;

import com.cjofernandez.msusuarios.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioDTO, Long> {
    Usuario save(Usuario usuario);
}