package helpdesk.helpdesk;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChamadoController {

	@RequestMapping("/chamado1")
    public Chamado chamado() {
        return new Chamado(1, "solicitante", "titulo", "descricao", "01-01-2019" , "01-01-2019" , 1, 1, 1, 1);
    }
	
	
}
