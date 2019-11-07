package helpdesk.helpdesk;

public class PrioridadeChamados {
	
	 private final int id;
	 private final String descricao;
	 	 
	 public PrioridadeChamados(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
			return id;
	}
		
	public String getDescricao() {
			return descricao;
	}

}
