package helpdesk.helpdesk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



public class UsuarioService {

	private static final List <Usuario> USUARIOS = new ArrayList<>();

	private final UsuarioController usuarioController;
	
	UsuarioService(final UsuarioController usuarioController){
		this.usuarioController = usuarioController;
	}

	@RequestMapping("/list")
	public List<Usuario> List(){
		return this.usuarioController.
    }
	
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable(value = "id") @Valid int id) {
		
		id = id - 1;
		
		if(id < 0 || id >= UsuarioService.USUARIOS.length){
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		final Usuario usuario = UsuarioService.USUARIOS[id];
		
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
	
}
