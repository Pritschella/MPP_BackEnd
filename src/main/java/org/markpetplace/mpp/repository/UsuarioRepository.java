package org.markpetplace.mpp.repository;

import java.util.Optional;

import org.markpetplace.mpp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	@Query("SELECT u FROM Usuario u WHERE u.id=?1")
	Usuario getById(Integer id);
	
	@Query("SELECT u FROM Usuario u WHERE u.correo=?1")
	Usuario getByEmail(String correo);
	
	Optional<Usuario> findByEmail(String correo);

}//interface
