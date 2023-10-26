package org.markpetplace.mpp.service;

import java.util.List;
import java.util.Optional;

import org.markpetplace.mpp.model.Usuario;
import org.markpetplace.mpp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	//Método GET para todos los registros
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
	
	//Método GET id
	/*public Optional<Usuario> getUsuarioById(Integer id){
		return usuarioRepository.findById(id);
	}
	*/
	
	
	//Método GET id con query personalizada 
		public Usuario getUsuarioById(Integer id) {
			return usuarioRepository.getById(id);
		}
	
	//Método GET id con query personalizada 
	public Usuario getUsuarioByEmail(String correo) {
		return usuarioRepository.getByEmail(correo);
	}
	
	
	//Método DELETE
	public void deleteUsuario(Integer id) {
		if(usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
		}else {
			throw new IllegalStateException("El cliente  con el Id solicitado no existe");
		}
	}//deleteUsuario
	
	
	//Método POST
	public void addUsuario(Usuario usuario) {
		Optional<Usuario> usuarioByEmail = usuarioRepository.findByEmail(usuario.getCorreo());
		
		if(usuarioByEmail.isPresent()) {
			throw new IllegalStateException("El cliente ya se encuentra registrado");
		}
		usuarioRepository.save(usuario);
	}//addUsuario
	
	//Método PUT
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	

}//class
