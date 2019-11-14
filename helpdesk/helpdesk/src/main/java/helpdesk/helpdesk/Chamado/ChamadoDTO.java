package helpdesk.helpdesk.Chamado;

public class ChamadoDTO {
	
	 public static final ChamadoDTO NULL_VALUE = new ChamadoDTO(-1l, "", "", "", "", "", "","");
	 
 	 private final Long id;
	 private final String solicitante;
	 private final String titulo;
	 private final String descricao;
	 private final String status;
	 private final String dataAbertura;
	 private final String dataAlvo;
	 private final String prioridadeChamado;
	
	
	 
	 public ChamadoDTO(Long id, String solicitante, String titulo, String descricao, String status, String dataAbertura, String dataAlvo, String prioridadeChamado) {
		this.id = id;
		this.status = status;
		this.solicitante = solicitante;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataAbertura = dataAbertura;
		this.dataAlvo = dataAlvo;
		this.prioridadeChamado = prioridadeChamado;
		
	}
	 
	 
	public Long getId() {
		return id;
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
