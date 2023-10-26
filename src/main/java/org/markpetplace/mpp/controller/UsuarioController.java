package org.markpetplace.mpp.controller;

import java.util.List;
//import java.util.Optional;

import org.markpetplace.mpp.model.Usuario;
import org.markpetplace.mpp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usuarios")
//http://localhost:8080/usuarios
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}) 
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@GetMapping
	public List<Usuario> getUsuarios(){
		return usuarioService.getUsuarios();
	}
	
	@GetMapping(path = "byId")
	public ResponseEntity<Usuario> getUsuarioById(@RequestParam Integer id){
		Usuario usuario = usuarioService.getUsuarioById(id);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
	
	/*@GetMapping(path = "{id}")
	public Optional<Usuario> getUsuario(@PathVariable("id") int id){
		return usuarioService.getUsuarioById(id);
	}
	*/
	
	@GetMapping(path = "byEmail")
	public ResponseEntity<Usuario> getUsuarioByEmail(@RequestParam String correo){
		Usuario usuario = usuarioService.getUsuarioByEmail(correo);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
	
	//Método para eliminar usuarios
	@DeleteMapping(path = "{id}")
	public void deleteUsuario(@PathVariable("id") Integer id) {
		usuarioService.deleteUsuario(id);
	}
	
	//Método para crear nuevos usuarios
	@PostMapping
	public void postUsuario(@RequestBody Usuario usuario) {
		usuarioService.addUsuario(usuario);
	}
	
	//Método para actualizar usuario
	@PutMapping(path = "{id")
	public Usuario updateUsuario(@PathVariable("id") Integer id, @RequestBody Usuario usuario) {
		usuario.setId(id);
		return usuarioService.updateUsuario(usuario);
	}

}//class
