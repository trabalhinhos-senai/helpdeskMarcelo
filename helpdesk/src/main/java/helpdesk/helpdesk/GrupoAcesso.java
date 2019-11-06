package helpdesk.helpdesk;

public class GrupoAcesso {
	
	private final int id;
	private final String nomeGrupo;
		 
	public GrupoAcesso(int id, String nomeGrupo) {
		super();
		this.id = id;
		this.nomeGrupo = nomeGrupo;
	}

	public int getId() {
		return id;
	}
	
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	 
	 

}
