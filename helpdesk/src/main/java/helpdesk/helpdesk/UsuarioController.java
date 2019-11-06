package helpdesk.helpdesk;

import org.springframework.stereotype.Controller;

@Controller
public class UsuarioController {
	
	private final UsuarioRepository usuarioRepository;
	
	UsuarioController(UsuarioRepository usuarioRepository) {
	    this.usuarioRepository = usuarioRepository;
	}
	
	
}
