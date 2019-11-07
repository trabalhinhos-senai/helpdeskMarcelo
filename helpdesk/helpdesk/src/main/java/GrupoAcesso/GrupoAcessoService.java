package GrupoAcesso;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

public class GrupoAcessoService {
	
	private final GrupoAcessoController grupoAcessoController;
	
	GrupoAcessoService(final GrupoAcessoController grupoAcessoController){
		this.grupoAcessoController = grupoAcessoController;
	}

	@RequestMapping("/list")
	public List<GrupoAcessoDTO> List(){
		return this.grupoAcessoController.getAllGruposAcesso();
    }
}
