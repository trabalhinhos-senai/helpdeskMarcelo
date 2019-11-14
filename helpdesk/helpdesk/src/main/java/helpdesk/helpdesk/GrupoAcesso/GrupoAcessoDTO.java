package helpdesk.helpdesk.GrupoAcesso;

import java.io.Serializable;

public class GrupoAcessoDTO implements Serializable {
	
	public static final GrupoAcessoDTO NULL_VALUE = new GrupoAcessoDTO(-1l,"");
	private Long id;
	private final String nomeGrupo;
			 
	public GrupoAcessoDTO(Long id, String nomeGrupo) {
		this.id = id;
		this.nomeGrupo = nomeGrupo;
	}

	public Long getId() {
		return id;
	}

	public String getNomeGrupo() {
		return nomeGrupo;
	}

}
