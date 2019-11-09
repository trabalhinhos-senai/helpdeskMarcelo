package helpdesk.helpdesk.GrupoAcesso;

public class GrupoAcessoDTO {
	
	public static final GrupoAcessoDTO NULL_VALUE = new GrupoAcessoDTO("");

	private final String nomeGrupo;
			 
	public GrupoAcessoDTO(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}
	
	public String getNomeGrupo() {
		return nomeGrupo;
	}

}
