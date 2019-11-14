package helpdesk.helpdesk.Chamado;

public class ChamadoDTO {
	
	 public static final ChamadoDTO NULL_VALUE = new ChamadoDTO("", "", "", "", "", "","");
	
	 private final String solicitante;
	 private final String titulo;
	 private final String descricao;
	 private final String status;
	 private final String dataAbertura;
	 private final String dataAlvo;

	 private final String prioridadeChamado;
	
	
	 
	 public ChamadoDTO(String solicitante, String titulo, String descricao, String status, String dataAbertura, String dataAlvo, String prioridadeChamado) {
		this.status = status;
		this.solicitante = solicitante;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataAlvo = dataAlvo;
		
		this.prioridadeChamado = prioridadeChamado;
		
	}
	 
	public String getSolicitante() {
		return solicitante;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public String getDataAlvo() {
		return dataAlvo;
	}
	
	public String getPrioridadeChamado() {
		return prioridadeChamado;
	}

	public String getStatus() {
		return status;
	}
	
	 
	 
	
}
