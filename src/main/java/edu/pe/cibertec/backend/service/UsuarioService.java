package edu.pe.cibertec.backend.service;

import edu.pe.cibertec.backend.model.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UsuarioService {
    public ResponseEntity<Map<String, Object>> listarUsuarios();
    public ResponseEntity<Map<String, Object>> registrarUsuario(Usuario usuario);
}
