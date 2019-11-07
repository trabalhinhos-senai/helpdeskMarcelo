package helpdesk.helpdesk;


import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chamados")
public class ChamadoController {
	private static final Chamado[] CHAMADOS = new Chamado[] { 
			new Chamado(1, "solicitante", "titulo", "descricao", "01-01-2019" , "01-01-2019" , 1, 1, 1, 1),
			new Chamado(2, "solicitante", "titulo", "descricao", "01-01-2019" , "01-01-2019" , 1, 1, 1, 1), 
			new Chamado(3, "solicitante", "titulo", "descricao", "01-01-2019" , "01-01-2019" , 1, 1, 1, 1) };

	@RequestMapping("/list")
    public Chamado[] list() {
        return ChamadoController.CHAMADOS;
    }
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Chamado> getChamado(@PathVariable(value = "id") @Valid int id) {
	
		id -= 1;
		
		if(isExistChamado(id)){		
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		final Chamado chamado = ChamadoController.CHAMADOS[id];
		return new ResponseEntity<>(chamado, HttpStatus.OK);
	}

	
	private boolean isExistChamado(int id) {
		return id < 0 || id >= ChamadoController.CHAMADOS.length;
	}
	
	
}
