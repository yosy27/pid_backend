package edu.pe.cibertec.backend.repository;

import edu.pe.cibertec.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findOneByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByNombre(String nombre);
    boolean existsByDni(String dni);
}
